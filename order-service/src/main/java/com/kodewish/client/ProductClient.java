package com.kodewish.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kodewish.response.ProductResponse;
@FeignClient(name = "product-service", url = "http://localhost:8082")
public interface ProductClient {

    @GetMapping("/flipkart/fetch/{id}")
    ProductResponse getProductById(@PathVariable int id);
}
