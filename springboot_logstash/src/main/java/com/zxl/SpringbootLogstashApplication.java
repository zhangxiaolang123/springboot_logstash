package com.zxl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * zxl
 */
@SpringBootApplication
@RestController
public class SpringbootLogstashApplication {

    Logger logger = LoggerFactory.getLogger(SpringbootLogstashApplication.class);

    @GetMapping("test")
    public void test(){
        logger.info("我来收集你的垃圾信息啦啦啦！");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLogstashApplication.class, args);
    }

}

