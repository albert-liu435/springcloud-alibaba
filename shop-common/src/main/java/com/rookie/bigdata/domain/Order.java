package com.rookie.bigdata.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Classname Order
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/14 17:50
 * @Version 1.0
 */
@Entity(name = "shop_order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;//订单id

    private Integer uid;//用户id

    private String username;//用户名

    private Integer pid;//产品id

    private String pname;//商品名称

    private String pprice;//商品价格

    private Integer number;//商品数量
}
