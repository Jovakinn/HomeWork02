package com.homework02.models;

public class Order extends Item {

    // variables
    private String product;
    private double quantity;

    // getter's and setter's
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    // constructor's
    public Order(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Order() {
    }
}
