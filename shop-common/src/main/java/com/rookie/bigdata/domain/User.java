package com.rookie.bigdata.domain;


import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @Classname User
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/14 17:40
 * @Version 1.0
 */
@Entity(name = "shop_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;//主键
    //用户名
    private String username;
    //密码
    private String password;
    //手机号
    private String telephone;

}
