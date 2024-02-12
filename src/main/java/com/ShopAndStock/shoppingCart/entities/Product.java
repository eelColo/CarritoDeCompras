package com.ShopAndStock.shoppingCart.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "products")
public class Product {

    @Column(name="id")
    private int id;

    @Column(name="product")
    private String name;

    @Column(name="info")
    private String description;

    @Column(name="price")
    private int price;

    @Column(name="stock")
    private int stock;


    public Product(){}
    public Product(int id, String name, String description, int price, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    /*a implementar
    private String category;
    */


}
