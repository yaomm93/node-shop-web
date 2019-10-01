package com.powerlbs.controller;

import com.powerlbs.beans.Goods;
import com.powerlbs.domain.Address;
import com.powerlbs.domain.Order;
import com.powerlbs.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs.controller
 *
 * @date:2019/9/28 20:44
 * @author:Yaoxiaoming
 **/
@Controller
@RequestMapping("/shop")

public class ShopController {
    @Autowired
    private ShopService shopService;
    @RequestMapping("/buy")
    public ModelAndView buyGoods(Integer userId, Goods goods){
        ModelAndView mv = new ModelAndView();
        Order order = shopService.createOrder(userId, goods);
        mv.addObject("order", order);
        mv.setViewName("view-order");
        return mv;
    }
    @RequestMapping("/addresses")
    public ModelAndView selectAddress(Integer userId){
        ModelAndView mv = new ModelAndView();
        List<Address> addresses = shopService.showAddress(userId);
        mv.addObject("addresses", addresses);
        mv.setViewName("view-address");
        return mv;

    }
}







