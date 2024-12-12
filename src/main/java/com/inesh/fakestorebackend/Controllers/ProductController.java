package com.inesh.fakestorebackend.Controllers;

import com.inesh.fakestorebackend.Models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    // testing
    int[] test = new int[5];

    @GetMapping(value = "/fakeStore/products")
    public Product getProductById(String id) {
        return null;
    }

    @GetMapping(value = "/fakeStore/products/all")
    public int[] getAllProducts(){
        return test;
    }

    @PostMapping(value = "/fakeStore/Products")
    public void createProduct(Product product) {

    }

    @DeleteMapping(value = "/fakeStore/products")
    public void deleteProduct(String id) {

    }

    @PutMapping(value = "/fakeStore/products")
    public void updateProduct(String id, Product product) {

    }
}
