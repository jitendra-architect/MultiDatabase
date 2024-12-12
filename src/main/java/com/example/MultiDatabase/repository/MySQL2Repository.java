package com.example.MultiDatabase.repository;

import com.example.MultiDatabase.entity.MySQLEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySQL2Repository extends JpaRepository<MySQLEntity, Long> {
}