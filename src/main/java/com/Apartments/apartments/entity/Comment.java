package com.Apartments.apartments.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "comments")
@Data
public class Comment
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    String noise;
    String services;
    String cleanliness;
    String friendliness;
    String amenities;
    String security;
    String maintenance;
}
