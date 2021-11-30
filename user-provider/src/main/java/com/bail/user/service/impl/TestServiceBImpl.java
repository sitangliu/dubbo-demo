package com.bail.user.service.impl;

import com.bail.user.service.TestServiceA;
import com.bail.user.service.TestServiceB;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/30 18:13
 */
@Service
public class TestServiceBImpl implements TestServiceB {

    private String name;

    @Resource
    private TestServiceA testServiceA;

}
