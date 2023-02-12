package com.qq.web;



import com.qq.info.OrderInfo;
import com.qq.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//作为微服务的一个方法 , 去给别人去使用
@RestController
@CrossOrigin
@RequestMapping("/order")
public class WfwOrderContoller {

    @Autowired
    OrderService orderService;


    /*
    这个只是 order微服务 提供给别人去访问的;
    Feign是通过Http访问的，在浏览器通过   http://127.0.0.1:8000/order/add   和  在order-api中访问是一个意思

    order是服务的提供者
    order-api是服务的调用者、使用者
     */
    @RequestMapping("/add")
//  public OrderInfo addOrder( OrderInfo orderInfo){   http://127.0.0.1:8000/order/add?number=111
    public OrderInfo addOrder( @RequestBody  OrderInfo orderInfo){  //被调用方 加 requestbody注解 是为了 order-api调order时  能把 参数传过来。
        System.out.println("order" + orderInfo);  // 插入前是没有id的
        int order = orderService.createOrder(orderInfo);
        orderInfo.setId(order); // 插入后才生成id，并返回回去
        return orderInfo;
    }

}
