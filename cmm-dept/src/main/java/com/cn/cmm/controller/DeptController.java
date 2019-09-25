package com.cn.cmm.controller;

import com.alibaba.fastjson.JSON;
import com.cn.cmm.entity.Dept;
import com.cn.cmm.service.DeptService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @ApiOperation(value = "根据Id查询用户信息" ,  notes="根据Id查询用户信息")
    @RequestMapping(value="/selectById",method= RequestMethod.POST)
    @ResponseBody
    public Dept selectById(@RequestBody Dept deptReq){
        Dept deptrRes = deptService.selectById(deptReq.getId());
//        for(int i=1;i<100;i++){
//            Dept dept = new Dept();
//            dept.setDeptName("dept"+i);
//            deptService.insert(dept);
//        }
        return deptrRes;
    }

    @ApiOperation(value = "查询用户信息" ,  notes="查询用户信息")
    @RequestMapping(value="/selectAll",method= RequestMethod.POST)
    @ResponseBody
    public PageInfo<Dept> selectAll(@RequestParam("page") int page,@RequestBody Dept dept){
        PageInfo<Dept> pageInfo = deptService.findAllUser(page,dept);
        // 用户组对象转JSON串
        String jsonString = JSON.toJSONString(pageInfo);
        System.out.println("jsonString:" + jsonString);
        return pageInfo;
    }
}
