package com.qq.service;



import com.qq.repository.OrderRepository;
import com.qq.info.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//作为微服务的一个给别人去使用
@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    //生成一个订单   (注意服务与服务间的调用 用的是 com.qq.info.OrderInfo;)
    public int createOrder(OrderInfo orderInfo){
//        将commons传来的OrderInfo，变为 order项目的OrderInfo
        com.qq.repository.info.OrderInfo o = new com.qq.repository.info.OrderInfo();
        o.setNumber(orderInfo.getNumber());

        try {
            return orderRepository.save(o).getId();  // save会返回一个实体类，get id就行
        }catch (Exception ex){
            System.out.println(ex);
            return -1;//代表我这个接口调用失败
        }
    }

}
