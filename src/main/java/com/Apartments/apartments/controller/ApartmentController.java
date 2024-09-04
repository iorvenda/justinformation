package com.Apartments.apartments.controller;

import com.Apartments.apartments.entity.Apartment;
import com.Apartments.apartments.entity.User;
import com.Apartments.apartments.services.ApartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    private static Logger logger = LoggerFactory.getLogger(ApartmentController.class );
    private final ApartmentService service;

    @Autowired
    public ApartmentController(ApartmentService service) {
        this.service = service;

    }
   // @PreAuthorize("hasRole('ADMIN")// add @MethodSecurity to securityConfig
    @PostMapping("/login")
    public String loginPage(Model model, User user_pw) {
        model.addAttribute("user", new User());

        return "login";  // Assuming 'index' is the form page for creating an apartment
    }
    @GetMapping("/index")
    public String indexPage(Model model) {
        model.addAttribute("apartment", new Apartment());
        logger.info("Redirected to signinpage.html");
        return "index";  // Assuming 'index' is the form page for creating an apartment
    }
    @GetMapping("/create")
    public String createApartmentForm(Model model) {
        model.addAttribute("apartment", new Apartment());

        return "create";  // Assuming 'index' is the form page for creating an apartment
    }

    @PostMapping("/save")
    @ResponseBody
    // for testing postman remove @ModelaAttribute @RequestBody
    public ResponseEntity<Apartment> saveApartment(@RequestBody  Apartment apartment)
    {

        try {
            RedirectView redirectView= new RedirectView();
            Apartment savedApartment = service.save(apartment);
          //  redirectView.setUrl("/comments");
            logger.info("An apartment," +apartment.getName()+"to the database");
            return new ResponseEntity<Apartment>(HttpStatus.FOUND);
        } catch (Exception e) {
            // Log the exception
            // logger.error("Error saving apartment", e);
            logger.error("Information for apartment"+apartment.getName()+" could not be added");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/getApartments")
    public ResponseEntity<List<Apartment>> getAllApartments(
            //@RequestParam(required = false) String location,
           // @RequestParam(required = false) Double minPrice,
           // @RequestParam(required = false) Double maxPrice
    )
    {
        List<Apartment> apartments;
        try {
            apartments = service.findAll();
            if (apartments.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(apartments);
            }
        } catch (Exception e) {
            // Log the exception
            // logger.error("Error retrieving apartments", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("")
    public String redirect()
    {

        return "redirect:/create";
    }
}
