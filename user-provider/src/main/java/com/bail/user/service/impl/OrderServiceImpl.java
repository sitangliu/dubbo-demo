package com.bail.user.service.impl;

import com.bail.user.service.IOrderService;
import com.bail.user.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 17:37
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Value("order.name")
    private String orderName;

    private Integer orderNum;

    @Resource
    private ProductService productService;

    @Override
    public String queryOrderList() {
        return "order list";
    }

    @Override
    public String getOrderById(Long orderId) {
        return "order one number";
    }
}
