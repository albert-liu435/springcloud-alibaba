package com.rookie.bigdata.dao;

import com.rookie.bigdata.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname OrderDao
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 15:54
 * @Version 1.0
 */
public interface OrderDao extends JpaRepository<Order,Long> {

}
