package com.productManagement.repository;

import com.productManagement.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    Product save(Product product);
}
