package com.varunramachandran.trinitystore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varunramachandran.trinitystore.model.Customer;
import com.varunramachandran.trinitystore.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	@Override
	public Customer getCustomer(Integer id) {
		Optional<Customer> customer = customerRepository.findById(id);
		return customer.get();
	}
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}
	
	@Override
	public void removeCustomer(Integer id) {
		customerRepository.deleteById(id);
	}
	
	@Override
	public Customer updateCustomer(Integer id, Customer customer) {
		Optional<Customer> existingCustomer = customerRepository.findById(id);
		BeanUtils.copyProperties(customer, existingCustomer.get(), "id");
		return customerRepository.saveAndFlush(existingCustomer.get());
	}

}
