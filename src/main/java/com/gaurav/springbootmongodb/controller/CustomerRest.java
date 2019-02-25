package com.gaurav.springbootmongodb.controller;

import com.gaurav.springbootmongodb.document.Customer;
import com.gaurav.springbootmongodb.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRest {

    private CustomerRepository repository;

    public CustomerRest(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){
        return repository.findAll();
    }
}
