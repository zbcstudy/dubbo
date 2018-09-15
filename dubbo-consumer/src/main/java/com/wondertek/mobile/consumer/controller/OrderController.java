package com.wondertek.mobile.consumer.controller;

import com.wondertek.mobile.dubbo.core.bean.UserAddress;
import com.wondertek.mobile.dubbo.core.service.OrderService;
import com.wondertek.mobile.dubbo.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("id") String userId) {

        return orderService.initOrder(userId);
    }
}
