package com.work.redis.controller;

import com.work.redis.service.RedisTem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisTem redisTem;

    @RequestMapping("/get")
    public Object get(){
        Object o = redisTem.get();
        return o;
    }
}
