package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Classname ProductService
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/16 18:24
 * @Version 1.0
 */
@FeignClient("service-product")//声明调用的提供者的name
public interface ProductService {


    //指定调用提供者的那个方法
    @GetMapping(value = "/product/{pid}")
    Product findByPid(@PathVariable("pid") Integer pid);
}
