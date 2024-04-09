package com.example.library.model;

import javax.persistence.*
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products", uniqueConstraints = @UniqueConstraint(columnNames= {"name","image"}))
public class Product {
    private Long id;
    private String name;
    private String description;
    private double constPrice;
    private double salePrice;
    private int currentQuantity;
    private String image;
    private Category category;
    private boolean is_deleted;
    private boolean is_activated;
}