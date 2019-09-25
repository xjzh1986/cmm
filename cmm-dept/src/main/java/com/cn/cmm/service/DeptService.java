package com.cn.cmm.service;

import com.cn.cmm.entity.Dept;
import com.cn.cmm.mapper.DeptMapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class DeptService {
    @Autowired
    DeptMapper deptMapper;

    public Dept selectById(int id){
        return deptMapper.selectById(id);
    }

    public void insert(Dept dept){
        deptMapper.insert(dept);
    }

    public PageInfo<Dept> findAllUser(int pageNum, Dept dept){
        int pageSize = 10;
        PageHelper.startPage(pageNum,pageSize);
        List<Dept> list = deptMapper.findAllDept(dept);
        PageInfo<Dept> pageInfo = new PageInfo<Dept>(list);
        return pageInfo;
    }
}
