package com.homework02.models;

public class Item {

    // variables
    // Vendor Code -> артикул
    private String vendorCode;
    private double price;
    private String name;

    // setter's and getter's
    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // constructor's
    public Item(String vendorCode, double price, String name) {
        this.vendorCode = vendorCode;
        this.price = price;
        this.name = name;
    }

    public Item() {
    }
}
