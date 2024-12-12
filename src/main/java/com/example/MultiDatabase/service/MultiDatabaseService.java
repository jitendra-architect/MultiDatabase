package com.example.MultiDatabase.service;

import com.example.MultiDatabase.entity.MongoEntity;
import com.example.MultiDatabase.entity.MySQLEntity;
import com.example.MultiDatabase.entity.PostgresEntity;
import com.example.MultiDatabase.repository.MyMongoRepository;
import com.example.MultiDatabase.repository.MySQL1Repository;
import com.example.MultiDatabase.repository.MySQL2Repository;
import com.example.MultiDatabase.repository.PostgresRepository;
import org.springframework.stereotype.Service;

@Service
public class MultiDatabaseService {

    private final MySQL1Repository mysql1Repository;
    private final MySQL2Repository mysql2Repository;
    private final PostgresRepository postgresRepository;
    private final MyMongoRepository mongoRepository;

    public MultiDatabaseService(MySQL1Repository mysql1Repository,
                                MySQL2Repository mysql2Repository,
                                PostgresRepository postgresRepository,
                                MyMongoRepository mongoRepository) {
        this.mysql1Repository = mysql1Repository;
        this.mysql2Repository = mysql2Repository;
        this.postgresRepository = postgresRepository;
        this.mongoRepository = mongoRepository;
    }

    public void saveToMySQL1(MySQLEntity entity) {
        mysql1Repository.save(entity);
    }

    public void saveToMySQL2(MySQLEntity entity) {
        mysql2Repository.save(entity);
    }

    public void saveToPostgres(PostgresEntity entity) {
        postgresRepository.save(entity);
    }

    public void saveToMongo(MongoEntity entity) {
        mongoRepository.save(entity);
    }
}
