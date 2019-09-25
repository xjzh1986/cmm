package com.cn.cmm.controller;

import com.alibaba.fastjson.JSON;
import com.cn.cmm.entity.BaseResult;
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

    @ApiOperation(value = "index" ,  notes="index")
    @RequestMapping(value="/index",method= RequestMethod.GET)
    @ResponseBody
    public String index(){

        return "cmm-dept";
    }

    @ApiOperation(value = "根据Id查询用户信息" ,  notes="根据Id查询用户信息")
    @RequestMapping(value="/selectById",method= RequestMethod.POST)
    @ResponseBody
    public BaseResult selectById(@RequestBody Dept deptReq){
        Dept deptrRes = deptService.selectById(deptReq.getId());
        BaseResult result = new BaseResult("200",deptrRes);
//        for(int i=1;i<100;i++){
//            Dept dept = new Dept();
//            dept.setDeptName("dept"+i);
//            deptService.insert(dept);
//        }
        return result;
    }

    @ApiOperation(value = "查询用户信息" ,  notes="查询用户信息")
    @RequestMapping(value="/selectAll",method= RequestMethod.POST)
    @ResponseBody
    public BaseResult selectAll(@RequestParam("page") int page, @RequestBody Dept dept){
        PageInfo<Dept> pageInfo = deptService.findAllUser(page,dept);
        BaseResult result = new BaseResult("200",pageInfo);
        return result;
    }
}
