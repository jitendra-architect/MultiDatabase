package com.example.multidatabase.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mysql_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MySQLEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    // Getters and Setters
}