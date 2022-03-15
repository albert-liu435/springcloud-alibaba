package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Classname UserApplication
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/14 17:34
 * @Version 1.0
 */
/*@EnableEurekaClient*/
@EnableDiscoveryClient
@SpringBootApplication
public class Product2Application {

    public static void main(String[] args) {
        SpringApplication.run(Product2Application.class, args);
    }
}
