package com.wondertek.mobile.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wondertek.mobile.dubbo.core.bean.UserAddress;
import com.wondertek.mobile.dubbo.core.service.OrderService;
import com.wondertek.mobile.dubbo.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 *      导入Dubbo依赖
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * dubbo在于spring进行整合时，有两种依赖注入的方式
     *  1.使用spring自动注入的注解进行依赖注入
     *  2.当dubbo与spring boot进行整合时，可以采用@Reference的方式直接进行远程调用
     */
//    @Reference
    @Autowired
    UserService userService;

    @HystrixCommand(fallbackMethod = "hello")
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress);
        }
        return addressList;
    }

    public List<UserAddress> hello(String userId) {
        return Arrays.asList(new UserAddress(10,"测试地址","测试","测试","测试","Y"));
    }
}
