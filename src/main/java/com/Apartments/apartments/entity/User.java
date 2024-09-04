package com.Apartments.apartments.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="roles_id", referencedColumnName = "id")
    private Set<Role> roles;
}
