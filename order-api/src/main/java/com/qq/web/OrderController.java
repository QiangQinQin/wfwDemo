package com.qq.web;


import com.qq.info.OrderInfo;
import com.qq.webfeign.OrderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order_api")
public class OrderController {

    @Autowired
    OrderFeignClient orderFeignClient; //我们一个接口有多个实现类了；导致我们不知道

//    http://127.0.0.1:8200/order_api/addOrder?number=111
    @RequestMapping("addOrder")
    public String addOrder(String number){

        //需要调用 另外一个服务里面的 得到他的信息
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setNumber(number);

        OrderInfo result = orderFeignClient.add(orderInfo); // 远程调用order模块的接口
        System.out.println(result);
        return null == result ? "error" : String.valueOf(result.getId());
    }

}
