//package com.wondertek.mobile.provicer.config;
//
//import com.alibaba.dubbo.config.*;
//import com.wondertek.mobile.dubbo.core.service.UserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class MyDubboConfig {
//
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig config = new ApplicationConfig();
//        config.setName("dubbo-provider");
//        return config;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig config = new RegistryConfig();
//
//        return config;
//    }
//
//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig config = new ProtocolConfig();
//
//        return config;
//    }
//
//    @Bean
//    public ServiceConfig<UserService> serviceConfig(UserService userService) {
//        ServiceConfig<UserService> config = new ServiceConfig<>();
//        config.setInterface(UserService.class);
//        config.setRef(userService);
//        config.setVersion("1.0.0");
//
//        //配置每一个method的信息
//        MethodConfig methodConfig = new MethodConfig();
//        methodConfig.setName("getUserAddressList");
//        methodConfig.setTimeout(5000);
//
//        //将method关联到service中
//        List<MethodConfig> methodConfigs = new ArrayList<>();
//        methodConfigs.add(methodConfig);
//        config.setMethods(methodConfigs);
//        return config;
//    }
//
//}
