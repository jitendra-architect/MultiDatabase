package com.example.MultiDatabase.config.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.MultiDatabase.config.mongodb") // Replace with your MongoDB repository package
public class MongoDBConfig {
}