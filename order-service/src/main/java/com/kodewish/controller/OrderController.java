package com.kodewish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.client.ProductClient;
import com.kodewish.response.ProductResponse;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final ProductClient productClient;

    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/fetchdata/{id}")
    public String createOrder(@PathVariable int id) {

        ProductResponse product = productClient.getProductById(id);

        return "Order details: " 
                + product.getName() 
                + " Price: " 
                + product.getPrice();
    }
}
