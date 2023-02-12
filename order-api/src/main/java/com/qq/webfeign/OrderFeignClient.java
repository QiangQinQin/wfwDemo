package com.qq.webfeign;


import com.qq.info.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "qq-order")   // 指明 要消费哪个服务 ,对应order的yml文件中指定了叫qq-order
public interface OrderFeignClient {

    @PostMapping("/order/add")
    public OrderInfo add(OrderInfo orderInfo);  // 服务间的调用 使用 commons下的OrderInfo

}
