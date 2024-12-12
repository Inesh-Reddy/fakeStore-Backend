package com.inesh.fakestorebackend.Models;


import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class Category {
    private Long id;
    private String title;


    public Category() {}

    public Category(Long id, String title) {
        this.title = title;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Category{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
                    "title='" + title + '\'' +
                '}';
    }
}
