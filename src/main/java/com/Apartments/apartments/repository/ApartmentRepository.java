package com.Apartments.apartments.repository;

import com.Apartments.apartments.entity.Apartment;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment,Integer>
{
// @Query("SELECT a FROM Apartment a WHERE (:location IS NULL OR a.location = :location) AND (:minPrice IS NULL OR a.price >= :minPrice) AND (:maxPrice IS NULL OR a.price <= :maxPrice)")
}
