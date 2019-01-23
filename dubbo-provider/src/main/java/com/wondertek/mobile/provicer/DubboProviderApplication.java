package com.wondertek.mobile.provicer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

/**
 * 1.导入依赖
 *      dubbo-starter
 *      导入其他依赖
 *  spring boot与Dubbo的整合方式
 *      1) 导入Dubbo-starter  在application.properties中配置属性
 *          使用@service暴露服务，使用@Reference引用服务
 *      2) 保留dubbo配置文件的方式
 *          @ImportResource（"classpath:provider.xml"）导入dubbo配置文件
 *      3) 使用注解api的方式
 *      将每一个组件手动配置到容器中,让dubbo扫描各个配置
 */
//@ImportResource("classpath:provider.xml")
@EnableDubbo
@EnableHystrix //提供服务容错
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class);
    }
}
