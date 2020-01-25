package com.varunramachandran.trinitystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varunramachandran.trinitystore.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
