package com.inesh.fakestorebackend.Controllers;

import com.inesh.fakestorebackend.Models.Product;
import com.inesh.fakestorebackend.Services.FakeStoreProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    // testing
    int[] test = new int[5];

    public FakeStoreProductService fakeStoreProductService;

    public ProductController(FakeStoreProductService fakeStoreProductService) {
        this.fakeStoreProductService = fakeStoreProductService;
    }

    @GetMapping(value = "/fakeStore/products")
    public Product getProductById(Long id) {
        fakeStoreProductService.getSingleProduct(id);
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
