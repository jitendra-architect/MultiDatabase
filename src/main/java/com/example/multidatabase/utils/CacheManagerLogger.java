package com.example.multidatabase.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CacheManagerLogger {

    private final CacheManager cacheManager;

    public CacheManagerLogger(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public void logCacheManager() {

        log.warn("Using CacheManager: " + cacheManager.getClass().getName());
    }
}
