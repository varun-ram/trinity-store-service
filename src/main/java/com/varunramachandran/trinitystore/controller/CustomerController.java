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

import com.varunramachandran.trinitystore.model.Customer;
import com.varunramachandran.trinitystore.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping
	@RequestMapping("{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}

	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void removeCustomer(@PathVariable Integer id) {
		customerService.removeCustomer(id);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
		return customerService.updateCustomer(id, customer);
	}

}
