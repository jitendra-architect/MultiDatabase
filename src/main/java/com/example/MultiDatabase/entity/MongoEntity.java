package com.example.MultiDatabase.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongo_collection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MongoEntity {
    @Id
    private String id;

    private String details;

    // Getters and Setters
}