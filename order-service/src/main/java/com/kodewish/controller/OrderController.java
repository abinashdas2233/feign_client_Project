package com.kodewish.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import com.kodewish.client.ProductClient;
import com.kodewish.response.ProductResponse;

@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger logger =
            LogManager.getLogger(OrderController.class);

    private final ProductClient productClient;

    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/fetchdata/{id}")
    public String createOrder(@PathVariable int id) {

        logger.info("Calling Product Service with id: {}", id);

        ProductResponse product = productClient.getProductById(id);

        logger.info("Received response from Product Service");

        return "Order details: "
                + product.getName()
                + " Price: "
                + product.getPrice();
    }
}