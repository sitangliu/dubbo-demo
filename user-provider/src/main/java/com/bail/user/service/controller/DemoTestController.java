package com.bail.user.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/12/17 16:44
 */
@RestController
@RequestMapping("demo")
public class DemoTestController {

    @Value("${outer.name}")
    private String outerName;

    @RequestMapping("/test1")
    public String test1(){

        return "test1".concat(outerName);
    }


}
