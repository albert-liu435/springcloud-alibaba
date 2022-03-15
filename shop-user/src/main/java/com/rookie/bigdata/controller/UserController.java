package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Product;
import com.rookie.bigdata.domain.User;
import com.rookie.bigdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 16:13
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("user/{pid}")
    public User user(@PathVariable("pid") Integer pid) {

        User user = userService.findById(pid);

        return user;


    }
}
