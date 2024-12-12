package com.inesh.fakestorebackend.Services;

import com.inesh.fakestorebackend.Dto.FakeStoreProductDto;
import com.inesh.fakestorebackend.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService  implements ProductService{

    private final RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product getSingleProduct(long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);
        System.out.println(fakeStoreProductDto.toString());
        System.out.println(fakeStoreProductDto.getProduct());
        return fakeStoreProductDto.getProduct();
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
