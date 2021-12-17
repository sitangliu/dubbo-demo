package com.bail.user.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 14:24
 */
@SpringBootApplication
//@ImportResource(locations = {"dubbo-provider.xml"})
public class UserProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderBootstrap.class,args);
    }

    /**
     * 此处的内部类为了测试配置类解析过程中，内部类的解析过程
     */
    @RestController
    @RequestMapping("/test")
    @PropertySource("outer-test.properties")
    class InnerTest{

        @Value("${outer.name}")
        private String outerName;

        @RequestMapping("/1")
        public String test1(){

            return "test1".concat(outerName);
        }
    }

}
