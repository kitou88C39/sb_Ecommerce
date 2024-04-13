package com.example.library.service;

import java.util.List;
import com.example.library.model.Category;

public interface CategoryService {
    List<Category>findAll();
    Category save(Category category);

    Category update(Category category);
}