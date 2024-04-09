package com.example.library.repository;

import com.example.library.model.Product;
import org.springfreamwork.data.jpa.Repository.JpaRepository;
import org.springfreamwork.stereotype.Repository;
public interface ProductRepository extends JpaRepository<Product, Long>{
}