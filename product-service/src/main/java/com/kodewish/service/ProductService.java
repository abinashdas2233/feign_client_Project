package com.kodewish.service;

import org.springframework.http.ResponseEntity;

import com.kodewish.request.ProductRequest;
import com.kodewish.response.ProductResponse;

public interface ProductService {
	public ResponseEntity createOrder(ProductRequest req);
	public ProductResponse getbyId(int id);

}
