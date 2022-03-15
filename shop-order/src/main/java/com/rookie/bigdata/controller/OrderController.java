package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Order;
import com.rookie.bigdata.domain.Product;
import com.rookie.bigdata.domain.User;
import com.rookie.bigdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname OrderController
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 15:57
 * @Version 1.0
 */

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;


    //准备买一件商品
    @GetMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid) {

        Product product = restTemplate.getForObject("http://localhost:8081/product/" + pid, Product.class);

        User user = restTemplate.getForObject("http://localhost:8071/user/" + pid, User.class);

        Order order = new Order();
        order.setNumber(1);
        // order.setOid(product.geto);
        order.setPid(product.getId());
        order.setUsername(user.getUsername());
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setUid(user.getUid());


        orderService.save(order);

       // System.out.println(product);

        return order;


    }
}