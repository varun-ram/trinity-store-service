package com.varunramachandran.trinitystore.service;

import java.util.List;

import com.varunramachandran.trinitystore.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProduct(Integer id);

	Product addProduct(Product product);

	void removeProduct(Integer id);

	Product updateProduct(Integer id, Product product);

}