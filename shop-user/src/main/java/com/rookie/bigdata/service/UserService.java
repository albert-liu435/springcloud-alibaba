package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.User;

/**
 * @Classname UserService
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 16:15
 * @Version 1.0
 */
public interface UserService {


    User findById(Integer uid);
}
