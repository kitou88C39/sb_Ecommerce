package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Category {
    private Long id;
    private String name;
    private boolean is_deleted;
    private boolean is_activated;
}