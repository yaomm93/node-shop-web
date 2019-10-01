package com.powerlbs.service.impl;

import com.powerlbs.beans.Goods;
import com.powerlbs.domain.Address;
import com.powerlbs.domain.Order;
import com.powerlbs.service.OrderService;
import com.powerlbs.service.ShopService;
import com.powerlbs.service.UserInfoService;

import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs.service.impl
 *
 * @date:2019/9/28 20:31
 * @author:Yaoxiaoming
 **/
public class ShopServiceImpl implements ShopService {
    private OrderService orderService;
    private UserInfoService userInfoService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @Override
    public Order createOrder(Integer userId, Goods goods) {
        Order order = orderService.createOrder(userId, goods.getName(), goods.getPrice(), goods.getAmount());
        return order;
    }

    @Override
    public List<Address> showAddress(Integer userId) {
        List<Address> addresses = userInfoService.queryAddress(userId);
        return addresses;
    }
}
