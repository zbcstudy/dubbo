package com.wondertek.mobile.provicer.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.wondertek.mobile.provicer.spi.service.OptimusPrime;
import com.wondertek.mobile.provicer.spi.service.Robot;
import com.wondertek.mobile.provicer.spi.service.SecondRobot;

/**
 * dubbo扩展的spi实现
 * @Author zbc
 * @Date 21:25-2019/1/22
 */
public class DubboSpi {
    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = (OptimusPrime) extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

        Robot secondRobot = (SecondRobot) extensionLoader.getExtension("secondRobot");
        secondRobot.sayHello();
    }
}
