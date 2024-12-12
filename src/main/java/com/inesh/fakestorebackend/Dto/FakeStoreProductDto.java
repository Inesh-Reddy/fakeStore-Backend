package com.inesh.fakestorebackend.Dto;

import com.inesh.fakestorebackend.Models.Category;
import com.inesh.fakestorebackend.Models.Product;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
    private String category;


    public Product getProduct() {

        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageUrl(image);

        Category cat = new Category();
        cat.setTitle(category);
        product.setCategory(cat);

        return product;
    }

    @Override
    public String toString() {
        return "FakeStoreProductDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}


//
//public class FakeStoreProductDto {
//    private long id;
//    private String title;
//    private double price;
//    private String description;
//    private String category;
//    private String image;
//
//    // Getters and setters
//    public Product getProduct() {
//        Product product = new Product();
//        product.setId(this.id);
//        product.setTitle(this.title);
//        product.setDescription(this.description);
//        product.setPrice(this.price);
//        product.setImageUrl(this.image);
//
//        Category productCategory = new Category();
//        productCategory.setTitle(this.category);
//        product.setCategory(productCategory);
//
//        return product;
//    }
//}
//
//public class Product {
//    private long id;
//    private String title;
//    private String description;
//    private double price;
//    private String imageUrl;
//    private Category category;
//
//    // Getters and setters with no-args constructor
//}
