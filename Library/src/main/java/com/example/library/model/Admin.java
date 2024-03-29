package com.example.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long id;
    private  String firstName;
    private  String lastName;
    private  String username;
    private  String password;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private  String image;

    private Collection<Role> roles;
}
