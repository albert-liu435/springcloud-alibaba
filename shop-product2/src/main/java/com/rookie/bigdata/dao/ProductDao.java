package com.rookie.bigdata.dao;

import com.rookie.bigdata.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname ProductDao
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 12:19
 * @Version 1.0
 */
public interface ProductDao extends JpaRepository<Product,Integer> {

}
