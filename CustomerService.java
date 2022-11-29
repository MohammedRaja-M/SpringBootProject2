package com.springboot.exapmple.present.service;

import java.util.List;

import com.springboot.exapmple.present.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
	void deleteCustomerById(long id);
}