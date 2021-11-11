package com.bail.user.service.impl;

import com.bail.user.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 17:37
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Override
    public String queryOrderList() {
        return "order list";
    }

    @Override
    public String getOrderById(Long orderId) {
        return "order one number";
    }
}
