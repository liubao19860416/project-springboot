package com.jh.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@ImportResource("classpath*:spring-context.xml")
//@EnableScheduling
//@SpringBootApplication(exclude = {GithubRepo.class})

//@SpringBootApplication
//@EnableAdminServer
@EnableAutoConfiguration
@ComponentScan("com.jh.springboot.*")
public class StartMainServer {
    
    private static final Logger logger = LoggerFactory.getLogger(StartMainServer.class);
    
    public static void main(String[] args) {
        logger.info("启动项目配置开始...");
        SpringApplication.run(StartMainServer.class, args);
        logger.info("启动项目配置结束...");
    }
    
}
