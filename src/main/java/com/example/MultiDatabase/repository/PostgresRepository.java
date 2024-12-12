package com.example.MultiDatabase.repository;

import com.example.MultiDatabase.entity.PostgresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepository extends JpaRepository<PostgresEntity, Long> {
}
