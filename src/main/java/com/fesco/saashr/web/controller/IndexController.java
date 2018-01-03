package com.fesco.saashr.web.controller;

import com.fesco.saashr.web.util.RedisComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: WangXingYu
 * @date: 2018-01-01
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private RedisComponent redisComponet;

    @RequestMapping
    public String index() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
        redisComponet.set("testKey", "testValue");
        return "index";
    }
}