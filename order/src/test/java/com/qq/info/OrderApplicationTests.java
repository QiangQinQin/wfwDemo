package com.qq.info;

import com.qq.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    OrderService orderService;


// 模拟远程接口调用，注意传 comons下的orderInfo
    @Test
    void test(){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setNumber("1234567");
        int order = orderService.createOrder(orderInfo);
        System.out.println(order);

    }
}
