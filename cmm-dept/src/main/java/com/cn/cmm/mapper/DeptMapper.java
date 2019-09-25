package com.cn.cmm.mapper;

import com.cn.cmm.entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface DeptMapper {

    Dept selectById(int id);

    void insert(Dept user);

    List<Dept> findAllDept(Dept user);
}
