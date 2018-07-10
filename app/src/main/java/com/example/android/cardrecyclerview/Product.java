package com.example.android.cardrecyclerview;

public class Product {
    private int id;
    private String shortDesc,title;
    private int image;
    private double ratings;
    private double price;

    public Product(int id, String shortDesc, String title, int image, double ratings, double price) {
        this.id = id;
        this.shortDesc = shortDesc;
        this.title = title;
        this.image = image;
        this.ratings = ratings;
        this.price = price;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public double getRatings() {
        return ratings;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
