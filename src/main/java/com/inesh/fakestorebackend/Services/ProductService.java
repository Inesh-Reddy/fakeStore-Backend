package com.inesh.fakestorebackend.Services;

import com.inesh.fakestorebackend.Models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long id);
    List<Product> getAllProducts();
    Product createProduct(Long id, String title, String description, Double price, String category);
    Product updateProduct(Long id, String title, String description, Double price, String category);
    void deleteProduct(Long id);

}
