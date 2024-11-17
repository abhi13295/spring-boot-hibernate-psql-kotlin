package com.outleap.demo.facade;

import com.outleap.demo.dto.CustomerDto;
import com.outleap.demo.entity.Customer;
import com.outleap.demo.service.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerFacade {

    private final CustomerService customerService;

    CustomerFacade(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void createCustomerFacade(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.contactNumber = customerDto.contactNumber;
        customer.email = customerDto.email;
        customer.name = customerDto.name;
        customerService.createCustomer(customer);
    }
}
