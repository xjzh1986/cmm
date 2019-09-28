package com.cn.cmm.service;

import com.cn.cmm.entity.Role;
import com.cn.cmm.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;

    public Role selectById(Long id){
        return roleMapper.selectByPrimaryKey(id);
    }

    public void insert(Role record){
        roleMapper.insert(record);
    }
}
