package com.homework02;

import com.homework02.service.CartService;

public class ApplicationRunner {

    public static void main(String[] args) {
        // run app

        CartService cartService = new CartService();
        cartService.getTotalSum();

    }
}
