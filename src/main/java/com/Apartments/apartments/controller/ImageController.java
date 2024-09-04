package com.Apartments.apartments.controller;

import com.Apartments.apartments.entity.Image;
import com.Apartments.apartments.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/upload")
    public String showUploadForm() {
        return "root";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
        try {
            imageService.saveImage(file);
            model.addAttribute("message", "File uploaded successfully!");
        } catch (IOException e) {
            model.addAttribute("message", "File upload failed!");
        }
        return "root";
    }

    @GetMapping("/image/{id}")
    @ResponseBody
    public ResponseEntity<byte[]> getImage(@PathVariable Long id) {
        Optional<Image> image = imageService.getImage(id);
        return image.map(value -> ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(value.getData()))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
