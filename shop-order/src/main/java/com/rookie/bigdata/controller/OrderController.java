package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Order;
import com.rookie.bigdata.domain.Product;
import com.rookie.bigdata.domain.User;
import com.rookie.bigdata.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

/**
 * @Classname OrderController
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 15:57
 * @Version 1.0
 */

@RestController
public class OrderController {


   private static final Logger logger= LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    @Autowired
    private DiscoveryClient discoveryClient;


    //准备买一件商品
    @GetMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid) {

//        ServiceInstance productServiceInstance = discoveryClient.getInstances("service-product").get(0);
//        String productUrl = productServiceInstance.getHost() + ":" + productServiceInstance.getPort();
//        Product product = restTemplate.getForObject("http://" + productUrl + "/product/" + pid, Product.class);

        //可以启动多个product服务，自定义规则实现挑选服务
        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        int index = new Random().nextInt(instances.size());
        ServiceInstance productServiceInstance = instances.get(index);
        String productUrl = productServiceInstance.getHost() + ":" + productServiceInstance.getPort();
        logger.info("请求url为{}",productUrl);

        Product product = restTemplate.getForObject("http://" + productUrl + "/product/" + pid, Product.class);


        ServiceInstance userServiceInstance = discoveryClient.getInstances("service-user").get(0);
        String userUrl = userServiceInstance.getHost() + ":" + userServiceInstance.getPort();
        User user = restTemplate.getForObject("http://" + userUrl + "/user/" + pid, User.class);


        //Product product = restTemplate.getForObject("http://localhost:8081/product/" + pid, Product.class);

        // User user = restTemplate.getForObject("http://localhost:8071/user/" + pid, User.class);

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
