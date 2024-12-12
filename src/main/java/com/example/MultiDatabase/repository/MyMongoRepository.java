package com.example.MultiDatabase.repository;

import com.example.MultiDatabase.entity.MongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyMongoRepository extends MongoRepository<MongoEntity, String> {
}