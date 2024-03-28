package com.example.library.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Admin {
    private Long id;

    private  String firstName;
    private  String lastName;
    private  String username;
    private  String password;
    private  String image;

    private Collection<Role> roles;
}
