package com.example.MultiDatabase.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
public class CacheManagerLogger {

    @Autowired
    private CacheManager cacheManager;

    public void logCacheManager() {
        System.out.println("Using CacheManager: " + cacheManager.getClass().getName());
    }
}
