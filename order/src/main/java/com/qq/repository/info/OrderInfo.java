package com.qq.repository.info;

import javax.persistence.*;


 /*
 实体类 ，添加jpa注解，用于order项目下 操作数据库的用
而 commons下的OrderInfo用作  服务与服务之间的调用
  */
@Entity
@Table(name = "order_info")
public class OrderInfo {
    //主键自增策略
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid")
    private int id;

    @Column(name = "onumber")
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
