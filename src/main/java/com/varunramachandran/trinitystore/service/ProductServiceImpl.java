package com.varunramachandran.trinitystore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varunramachandran.trinitystore.model.Product;
import com.varunramachandran.trinitystore.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@Override
	public Product getProduct(Integer id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}
	
	@Override
	public Product addProduct(Product product) {
		return productRepository.saveAndFlush(product);
	}
	
	@Override
	public void removeProduct(Integer id) {
		productRepository.deleteById(id);
	}
	
	@Override
	public Product updateProduct(Integer id, Product product) {
		Optional<Product> existingProduct = productRepository.findById(id);
		BeanUtils.copyProperties(product, existingProduct.get(), "id");
		return productRepository.saveAndFlush(existingProduct.get());
	}

}
