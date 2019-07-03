package com.homework02.service;

import com.homework02.models.Cart;

public class CartService extends Cart {

    public static void getTotalSum(){
        Cart cart = new Cart();
        // Cart
        cart.setOrder("MyOrder1");
        cart.setUser("Max");

        // Item
        cart.setName("Уничтожитель бетона 3000+");
        cart.setVendorCode("Hjkwlvwb1y913");
        cart.setPrice(100.0);

        // Order
        cart.setProduct("Перфоратор");
        cart.setQuantity(1.0);

        // Calculating total sum
        double sum = cart.getPrice() * cart.getQuantity();
        System.out.println("Total sum: " + sum);
    }

}
