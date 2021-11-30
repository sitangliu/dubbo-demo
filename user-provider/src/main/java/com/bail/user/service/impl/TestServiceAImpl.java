package com.bail.user.service.impl;

import com.bail.user.service.TestServiceA;
import com.bail.user.service.TestServiceB;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/30 18:12
 */
@Service
public class TestServiceAImpl implements TestServiceA {

    private String name;

    private Integer age;

    @Resource
    private TestServiceB testServiceB;

}
