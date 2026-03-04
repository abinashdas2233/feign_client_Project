package com.kodewish.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kodewish.request.ProductRequest;
import com.kodewish.response.ProductResponse;
import com.kodewish.service.ProductService;

@RestController
@RequestMapping("/flipkart")
public class ProductController {

    private static final Logger log = LogManager.getLogger(ProductController.class);

    @Autowired
    ProductService service;

    @PostMapping("/create")
    public ResponseEntity<?> orderPlace(@RequestBody ProductRequest req) {

        log.info("Received request to create product: {}", req.getName());

        ResponseEntity<?> response = service.createOrder(req);

        log.info("Product created successfully");

        return response;
    }

    @GetMapping("/fetch/{id}")
    public ProductResponse getProduct(@PathVariable int id) {

        log.info("Fetching product with id: {}", id);

        ProductResponse response = service.getbyId(id);

        log.info("Product fetched: {}", response.getName());

        return response;
    }
}