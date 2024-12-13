package com.example.multidatabase.repository;

import com.example.multidatabase.entity.PostgresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepository extends JpaRepository<PostgresEntity, Long> {
}
