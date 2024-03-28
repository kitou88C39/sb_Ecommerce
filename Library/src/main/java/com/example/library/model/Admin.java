package com.example.library.model;

import java.util.Collection;

public class Admin {
    private Long id;

    private  String firstName;
    private  String lastName;
    private  String username;
    private  String password;
    private  String image;

    private Collection<Role> roles;
}
