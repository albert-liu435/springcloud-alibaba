package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.dao.OrderDao;
import com.rookie.bigdata.domain.Order;
import com.rookie.bigdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname OrderServiceImpl
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 15:56
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void save(Order order) {

        orderDao.save(order);

    }
}
