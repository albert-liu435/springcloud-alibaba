package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Product;
import com.rookie.bigdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ProductController
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 12:23
 * @Version 1.0
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("product/{pid}")
    public Product product(@PathVariable("pid") Integer pid){

        Product product = productService.findByPId(pid);

        return product;


    }
}
