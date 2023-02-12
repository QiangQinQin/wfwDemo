package com.qq.repository;


import com.qq.repository.info.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

 //使用jpa技术操作数据库 ， 类型是当前项目下的 OrderInfo，主键是Integer
public interface OrderRepository extends JpaRepository<OrderInfo,Integer> {
}
