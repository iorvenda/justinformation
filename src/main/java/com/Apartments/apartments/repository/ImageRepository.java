package com.Apartments.apartments.repository;

import com.Apartments.apartments.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}