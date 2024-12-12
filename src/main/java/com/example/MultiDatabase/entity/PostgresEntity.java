package com.example.MultiDatabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "postgres_table")
public class PostgresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    // Getters and Setters
}