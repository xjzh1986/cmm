package com.cn.cmm.service;



import com.cn.cmm.entity.Role;
import com.cn.cmm.entity.User;
import com.cn.cmm.mapper.RoleMapper;
import com.cn.cmm.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    RoleMapper roleMapper;

    @Transactional(rollbackFor = Exception.class)
    public User selectById(int id){
        Role role = new Role();
        role.setRole_name("roleX");
        roleMapper.insert(role);
        int i = 10/0;
        return userMapper.selectById(id);
    }

    public void insert(User user){
        userMapper.insert(user);
    }

    public PageInfo<User> findAllUser(int pageNum, User user){
        int pageSize = 10;
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userMapper.findAllUser(user);
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo;
    }
}
