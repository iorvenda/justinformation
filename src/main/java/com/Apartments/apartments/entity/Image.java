package com.Apartments.apartments.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="images")
@Data
public class Image
{
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    long id;
    String name;

    @Lob
    private byte[] data;

}
