package com.example.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "admin")
public class Admin {
    private Long id;

    private  String firstName;
    private  String lastName;
    private  String username;
    private  String password;
    private  String image;

    private Collection<Role> roles;
}
