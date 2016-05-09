package com.jh.springboot;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * 
 * @author Liubao
 * @2016年5月8日
 *
 */
//@ImportResource("classpath*:spring-context.xml")
//@EnableScheduling
//@SpringBootApplication(exclude = {GithubRepo.class})

@SpringBootApplication
@EnableAdminServer
@ComponentScan("com.jh.springboot")
public class StartMainServer {
    
    private static final Logger logger = LoggerFactory.getLogger(StartMainServer.class);
    
    public static void main(String[] args) {
        logger.info("启动项目配置开始...");
        SpringApplication.run(StartMainServer.class, args);
        
//        SpringApplication app = new SpringApplication(StartMainServer.class);  
//        app.setWebEnvironment(true);  
//        app.setShowBanner(false);  
//        Set<Object> set = new HashSet<Object>();  
//        //set.add("classpath:applicationContext.xml");  
//        app.setSources(set);  
//        app.run(args);  
        logger.info("启动项目配置结束...");
    }  
    
}
