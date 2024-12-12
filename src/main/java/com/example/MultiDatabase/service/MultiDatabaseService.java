package com.example.MultiDatabase.service;

import com.example.MultiDatabase.entity.MongoEntity;
import com.example.MultiDatabase.entity.MySQLEntity;
import com.example.MultiDatabase.entity.PostgresEntity;
import com.example.MultiDatabase.repository.MongoRepository;
import com.example.MultiDatabase.repository.MySQLRepository;
import com.example.MultiDatabase.repository.PostgresRepository;
import org.springframework.stereotype.Service;

@Service
public class MultiDatabaseService {

    private final MySQLRepository mysqlRepository;
    private final PostgresRepository postgresRepository;
    private final MongoRepository mongoRepository;

    public MultiDatabaseService(MySQLRepository mysqlRepository,
                                PostgresRepository postgresRepository,
                                MongoRepository mongoRepository) {
        this.mysqlRepository = mysqlRepository;
        this.postgresRepository = postgresRepository;
        this.mongoRepository = mongoRepository;
    }

    public void saveToMySQL(MySQLEntity entity) {
        mysqlRepository.save(entity);
    }

    public void saveToPostgres(PostgresEntity entity) {
        postgresRepository.save(entity);
    }

    public void saveToMongo(MongoEntity entity) {
        mongoRepository.save(entity);
    }
}
