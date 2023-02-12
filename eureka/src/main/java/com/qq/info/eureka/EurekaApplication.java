package com.qq.info.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // 代表我们当前这个springboot的项目 作为一个服务注册中心 (即所有的服务都可以注册到这里面； 所有的服务都可以通过他来发现别的服务)
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
