package com.example.multidatabase.repository;

import com.example.multidatabase.entity.MongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyMongoRepository extends MongoRepository<MongoEntity, String> {
}