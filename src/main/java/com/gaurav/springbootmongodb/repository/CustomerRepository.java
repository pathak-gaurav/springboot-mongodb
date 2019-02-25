package com.gaurav.springbootmongodb.repository;

import com.gaurav.springbootmongodb.document.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Long> {
}
