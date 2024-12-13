package com.example.multidatabase.service;

import com.example.multidatabase.utils.CacheManagerLogger;
import com.example.multidatabase.entity.MongoEntity;
import com.example.multidatabase.entity.MySQLEntity;
import com.example.multidatabase.entity.PostgresEntity;
import com.example.multidatabase.repository.MyMongoRepository;
import com.example.multidatabase.repository.MySQL1Repository;
import com.example.multidatabase.repository.MySQL2Repository;
import com.example.multidatabase.repository.PostgresRepository;
import org.springframework.stereotype.Service;

@Service
public class MultiDatabaseService {

    private final MySQL1Repository mysql1Repository;
    private final MySQL2Repository mysql2Repository;
    private final PostgresRepository postgresRepository;
    private final MyMongoRepository mongoRepository;
    private final CacheManagerLogger cacheManagerLogger;

    public MultiDatabaseService(MySQL1Repository mysql1Repository,
                                MySQL2Repository mysql2Repository,
                                PostgresRepository postgresRepository,
                                MyMongoRepository mongoRepository,
                                CacheManagerLogger cacheManagerLogger) {
        this.mysql1Repository = mysql1Repository;
        this.mysql2Repository = mysql2Repository;
        this.postgresRepository = postgresRepository;
        this.mongoRepository = mongoRepository;
        this.cacheManagerLogger = cacheManagerLogger;
    }

    public void saveToMySQL1(MySQLEntity entity) {
        cacheManagerLogger.logCacheManager();
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