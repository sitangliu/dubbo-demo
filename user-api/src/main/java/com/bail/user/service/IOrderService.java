package com.bail.user.service;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/11/11 17:37
 */
public interface IOrderService {

    public String queryOrderList();

    public String getOrderById(Long orderId);
}
