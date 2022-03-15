package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Product;

/**
 * @Classname ProoductService
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 12:20
 * @Version 1.0
 */
public interface ProductService {

     Product findByPId(Integer id);
}
