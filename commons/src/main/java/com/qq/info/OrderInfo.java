package com.qq.info;

import java.io.Serializable;

// 使用lombok小辣椒 可以生成get set；
//用作服务与服务之间的调用
public class OrderInfo implements Serializable {
    private int id;
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
