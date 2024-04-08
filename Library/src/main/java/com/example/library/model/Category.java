package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import  javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = categories, uniqueConstraints = @UniqueConstraint(columnNames="name"))
public class Category {
    private Long id;
    private String name;
    private boolean is_deleted;
    private boolean is_activated;
}