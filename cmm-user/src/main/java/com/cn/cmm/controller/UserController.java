package com.cn.cmm.controller;

import com.alibaba.fastjson.JSON;
import com.cn.cmm.entity.BaseResult;
import com.cn.cmm.entity.Dept;
import com.cn.cmm.entity.User;
import com.cn.cmm.service.IDeptService;
import com.cn.cmm.service.UserService;
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
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private IDeptService iDeptService;

    @ApiOperation(value = "根据Id查询用户信息" ,  notes="根据Id查询用户信息")
    @RequestMapping(value="/selectById",method= RequestMethod.POST)
    @ResponseBody
    public User selectById(@RequestBody User userReq){
        Dept dept = new Dept();
        dept.setId(1);
        BaseResult deptResult = iDeptService.selectById(dept);
        User userRes = userService.selectById(1);
        return userRes;
    }

    @ApiOperation(value = "查询用户信息" ,  notes="查询用户信息")
    @RequestMapping(value="/selectAll",method= RequestMethod.POST)
    @ResponseBody
    public PageInfo<User> selectAll(@RequestParam("page") int page, @RequestBody User user){
        PageInfo<User> pageInfo = userService.findAllUser(page,user);
        // 用户组对象转JSON串
        String jsonString = JSON.toJSONString(pageInfo);
        System.out.println("jsonString:" + jsonString);
        return pageInfo;
    }
}
