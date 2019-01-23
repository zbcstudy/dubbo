package com.wondertek.mobile.provicer.spi;

import com.wondertek.mobile.provicer.spi.service.Robot;

import java.util.ServiceLoader;

/**
 * Java自带的spi实现
 * @Author zbc
 * @Date 21:03-2019/1/22
 */
public class JdkSpi {

    public static void main(String[] args) {
        ServiceLoader<Robot> robots = ServiceLoader.load(Robot.class);
        System.out.println("java spi");
        robots.forEach(robot -> robot.sayHello());
    }
}
