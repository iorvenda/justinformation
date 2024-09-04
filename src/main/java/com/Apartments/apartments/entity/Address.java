package com.Apartments.apartments.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    int number;
    String streetName;
    String city;
    String state;
    int zipcode;
}
