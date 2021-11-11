package com.bail.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 14:24
 */
@SpringBootApplication
@ImportResource(locations = {"dubbo-provider.xml"})
public class UserProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderBootstrap.class,args);
    }

}
