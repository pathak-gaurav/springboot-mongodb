package com.gaurav.springbootmongodb;

import com.gaurav.springbootmongodb.document.Customer;
import com.gaurav.springbootmongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMongodbApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Customer(1L,"Zack","Anderson"));
        repository.save(new Customer(2L,"Cody","Anderson"));
        repository.save(new Customer(3L,"Zoella","Sugg"));
    }
}
