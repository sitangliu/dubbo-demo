package com.bail.user.controller;

import com.bail.user.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 16:11
 */
@RestController
@RequestMapping("/view/user")
public class UserController {


    @Resource
    private IUserService userService;

    @RequestMapping("/list")
    public String getUserList(){
        String list = userService.queryList();
        return list;
    }

}
