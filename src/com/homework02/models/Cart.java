package com.homework02.models;

public class Cart extends Order {

    // variables
    private String user;
    private String order;

    // getter's and setter's
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    // constructor's
    public Cart(String user, String order) {
        this.user = user;
        this.order = order;
    }

    public Cart() {
    }
}
