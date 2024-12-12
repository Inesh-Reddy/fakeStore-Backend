package com.inesh.fakestorebackend.Services;

import com.inesh.fakestorebackend.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService  implements ProductService{

    public Product getSingleProduct(Long id) {
        System.out.println("getSingleProduct");
        return null;
    }

    public List<Product> getAllProducts() {
        return List.of();
    }

    public Product createProduct(Long id, String title, String description, Double price, String category) {
        return null;
    }

    public Product updateProduct(Long id, String title, String description, Double price, String category) {
        return null;
    }

    public void deleteProduct(Long id) {

    }

}
