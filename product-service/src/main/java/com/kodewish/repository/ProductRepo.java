package com.kodewish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewish.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
