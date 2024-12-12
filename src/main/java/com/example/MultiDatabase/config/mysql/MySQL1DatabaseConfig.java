package com.example.MultiDatabase.config.mysql;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.example.MultiDatabase.config.mysql", // Replace with your MySQL repository package
        entityManagerFactoryRef = "mysql1EntityManagerFactory",
        transactionManagerRef = "mysql1TransactionManager"
)
public class MySQL1DatabaseConfig  {

    @Bean(name = "mysql1DataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.mysql1")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mysql1EntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mysql1DataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.entity.mysql1") // Replace with your MySQL entity package
                .persistenceUnit("mysql1")
                .build();
    }

    @Bean(name = "mysql1TransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("mysql1EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
