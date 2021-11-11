package com.bail.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 15:45
 */
@SpringBootApplication
@ImportResource(locations = {"dubbo-consumer.xml"})
public class UserConsumerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerBootstrap.class,args);
    }

}
