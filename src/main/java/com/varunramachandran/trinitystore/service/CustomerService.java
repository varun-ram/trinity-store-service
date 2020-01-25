package com.varunramachandran.trinitystore.service;

import java.util.List;

import com.varunramachandran.trinitystore.model.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();

	Customer getCustomer(Integer id);

	Customer addCustomer(Customer customer);

	void removeCustomer(Integer id);

	Customer updateCustomer(Integer id, Customer customer);

}