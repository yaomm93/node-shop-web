package com.powerlbs.service;

import com.powerlbs.beans.Goods;
import com.powerlbs.domain.Address;
import com.powerlbs.domain.Order;

import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs.service
 *
 * @date:2019/9/28 20:13
 * @author:Yaoxiaoming
 **/
public interface ShopService {
    public Order createOrder(Integer userId, Goods goods);
    public List<Address> showAddress(Integer userId);
}
