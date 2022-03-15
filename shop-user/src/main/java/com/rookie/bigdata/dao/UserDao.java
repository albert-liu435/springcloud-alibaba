package com.rookie.bigdata.dao;

import com.rookie.bigdata.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname UserDao
 * @Description TODO
 * @Author rookie
 * @Date 2022/3/15 16:14
 * @Version 1.0
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
