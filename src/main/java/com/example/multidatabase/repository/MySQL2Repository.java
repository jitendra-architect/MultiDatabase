package com.example.multidatabase.repository;

import com.example.multidatabase.entity.MySQLEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySQL2Repository extends JpaRepository<MySQLEntity, Long> {
}