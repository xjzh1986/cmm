package com.cn.cmm.controller;

import com.cn.cmm.entity.Role;
import com.cn.cmm.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "根据Id查询用户信息" ,  notes="根据Id查询用户信息")
    @RequestMapping(value="/role/selectById",method= RequestMethod.POST)
    @ResponseBody
    public Role selectById(@RequestBody Role roleReq){
        Role ruleRes = roleService.selectById(roleReq.getId());
        return ruleRes;
    }


}
