package com.kodewish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kodewish.entity.ProductEntity;
import com.kodewish.repository.ProductRepo;
import com.kodewish.request.ProductRequest;
import com.kodewish.response.ProductResponse;

@Service
public class ProductServiceImplementation implements ProductService{
	@Autowired
	ProductRepo repo;

	@Override
	public ResponseEntity createOrder(ProductRequest req) {
		
		ProductEntity entity=new ProductEntity();
		entity.setName(req.getName());
		entity.setPrice(req.getPrice());
		entity.setStaus(req.getStaus());
		
		ProductEntity res=repo.save(entity);
		
		
		return ResponseEntity.ok("order status:-"+res);
	}

	@Override
	public ProductResponse getbyId(int id) {
		ProductEntity entity=repo.findById(id).get();
		
		ProductResponse response=new ProductResponse();
		response.setId(entity.getId());
		response.setName(entity.getName());
		response.setPrice(entity.getPrice());
		response.setStatus(entity.getStaus());
		return response;
	}
	
	

}
