package com.rookie.bigdata.controller;

import com.alibaba.fastjson.JSON;
import com.rookie.bigdata.domain.Order;
import com.rookie.bigdata.domain.Product;
import com.rookie.bigdata.domain.User;
import com.rookie.bigdata.service.OrderService;
import com.rookie.bigdata.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Classname OrderController
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 15:57
 * @Version 1.0
 */

@RestController(value = "orderController2")
public class OrderController2 {


   private static final Logger logger= LoggerFactory.getLogger(OrderController2.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductService productService;



    @RequestMapping("/order/message")
    public String message(){

        return "高并发下的问题测试";
    }
}
