package com.example.library.repository;

import com.example.library.model.Category;
import org.springfreamwork.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
}