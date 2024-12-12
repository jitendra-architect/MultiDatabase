package com.example.MultiDatabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mysql_table")
public class MySQLEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters and Setters
}