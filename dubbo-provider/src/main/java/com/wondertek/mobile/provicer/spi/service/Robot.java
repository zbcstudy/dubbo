package com.wondertek.mobile.provicer.spi.service;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Robot {

    void sayHello();
}
