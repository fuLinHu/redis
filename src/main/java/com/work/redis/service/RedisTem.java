package com.work.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisTem {
    @Autowired
    private StringRedisTemplate redis;
    final String  USER = "user";

    public Object get(){
        redis.opsForValue().set(USER,"fu li hu.",10,TimeUnit.SECONDS);
        String s = redis.opsForValue().get(USER);


        return s;
    }

}
