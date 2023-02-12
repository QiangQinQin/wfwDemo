package com.qq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient  //代表我当前这个微服务是一个服务的消费者 ，去 调用别的服务
@EnableFeignClients  // 表示我们用feign的方式去消费服务
public class OrderApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApiApplication.class, args);
    }

}
