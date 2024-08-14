package com.shubham.simplewebApp.model;

import java.util.Locale;

public class Product {

    private int prodID;
    private String prodName;
    private int price;

    public Product(int prodID, String prodName , int price) {
        this.prodID = prodID;
        this.price = price;
        this.prodName = prodName;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getProdName() {
        return prodName;
    }
}
