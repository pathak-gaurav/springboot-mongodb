package com.gaurav.springbootmongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.gaurav.springbootmongodb")
public class MongoConfig {

}
