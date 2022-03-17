package com.rookie.bigdata.controller;


import com.rookie.bigdata.service.OrderService;
import com.rookie.bigdata.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname OrderController
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 15:57
 * @Version 1.0
 */

@RestController(value = "orderController3")
public class OrderController3 {


   private static final Logger logger= LoggerFactory.getLogger(OrderController3.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductService productService;



    @RequestMapping("/order/message1")
    public String message1(){

        return "message1";
    }

    @RequestMapping("/order/message2")
    public String message2(){

        return "message2";
    }
}
