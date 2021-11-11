package com.bail.user.service.impl;

import com.bail.user.service.IUserService;
import org.springframework.stereotype.Service;


/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 14:02
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String queryList() {
        return "list user";
    }

    @Override
    public String getUserById(Long id) {

        return "user one";
    }
}
