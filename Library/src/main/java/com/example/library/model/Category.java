package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import  javax.persistence.*;

import  javax.persistence.Entity;
import  javax.persistence.JoinTable;
import  javax.persistence.Tavle;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = categories, uniqueConstraints = @UniqueConstraint(columnNames="name"))
@Table(name = categories)

@Data
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENITY)
    @Column(name = "category_id")
    private Long id;
    private String name;
    private boolean is_deleted;
    private boolean is_activated;
}