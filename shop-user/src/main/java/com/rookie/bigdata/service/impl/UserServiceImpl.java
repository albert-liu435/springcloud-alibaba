package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.dao.UserDao;
import com.rookie.bigdata.domain.User;
import com.rookie.bigdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 16:16
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User findById(Integer uid) {
        return userDao.findById(uid).get();
    }
}
