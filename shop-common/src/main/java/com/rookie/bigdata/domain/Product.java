package com.rookie.bigdata.domain;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @Classname Product
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/14 17:48
 * @Version 1.0
 */
@Entity(name="shop_product")
@Data
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//主键
    private String pname;//商品名称
    private String pprice;//商品价格
    private Integer stock;//商品库存

}
