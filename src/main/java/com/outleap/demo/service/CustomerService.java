package com.outleap.demo.service;

import com.outleap.demo.entity.Customer;
import com.outleap.demo.repository.CustomerRepository;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private final CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
