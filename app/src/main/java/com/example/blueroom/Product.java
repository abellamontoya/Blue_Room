package com.example.blueroom;

public class Product {
    public String author;  // Cambiado a minúscula
    public String imageURL;
    public String name;    // Cambiado a minúscula
    public int quantity;   // Cambiado a minúscula
    public int price;      // Cambiado a minúscula

    // Constructor vacío requerido por Firestore
    public Product() {}

    public Product(String imageURL, String name, String author, int price, int quantity) {
        this.imageURL = imageURL;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
