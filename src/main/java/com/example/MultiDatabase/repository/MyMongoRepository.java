package com.example.MultiDatabase.repository;

import com.example.MultiDatabase.entity.MongoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepository extends MongoRepository<MongoEntity, String> {
}