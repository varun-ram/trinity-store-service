package com.varunramachandran.trinitystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.varunramachandran.trinitystore.model.Product;
import com.varunramachandran.trinitystore.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping
	@RequestMapping("{id}")
	public Product getProduct(@PathVariable Integer id) {
		return productService.getProduct(id);
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void removeProduct(@PathVariable Integer id) {
		productService.removeProduct(id);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

}
