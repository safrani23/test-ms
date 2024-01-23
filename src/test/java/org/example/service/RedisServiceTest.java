package org.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class RedisServiceTest {

    @Autowired
    private RedisService redisService;

    @Test
    void setValue() {
        redisService.setValue("testKey", "testValue");
    }

    @Test
    void getValue() {

    }
}