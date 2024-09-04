package com.Apartments.apartments.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="apartment")
@Data
public class Apartment
{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;

    UUID uuid =UUID.randomUUID();

    String name;
    String address;
    String rating;
    String state;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id", referencedColumnName = "id")
    List<Comment> comment;
    String city;

}
