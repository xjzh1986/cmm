package com.cn.cmm.mapper;

import com.cn.cmm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User selectById(int id);

    void insert(User user);

    List<User> findAllUser(User user);
}
