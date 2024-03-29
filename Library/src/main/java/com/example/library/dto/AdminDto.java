package com.example.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDto {
    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String repeatPassword;
}
