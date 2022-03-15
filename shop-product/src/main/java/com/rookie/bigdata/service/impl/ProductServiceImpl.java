package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.dao.ProductDao;
import com.rookie.bigdata.domain.Product;
import com.rookie.bigdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname ProductServiceImpl
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 12:19
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    @Override
    public Product findByPId(Integer id) {
        return productDao.findById(id).get();
    }
}
