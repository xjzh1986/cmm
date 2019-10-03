package com.cn.cmm.controller;


import com.cn.cmm.entity.User;
import com.cn.cmm.redis.RedisUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private RedisUtil redisUtil;

    @ApiOperation(value = "登录" ,  notes="登录")
    @RequestMapping(value="/login/doLogin",method= RequestMethod.POST)
    @ResponseBody
    public String doLogin(@RequestBody User userReq){
        userReq.setUserName("XXX");
        userReq.setPassWord("1111");
        redisUtil.set("sysuser"+2,userReq);
        return "SUCCESS";
    }

    @ApiOperation(value = "登出" ,  notes="登出")
    @RequestMapping(value="/login/removeLogin",method= RequestMethod.POST)
    @ResponseBody
    public String removeLogin(@RequestBody User userReq){
        Object object = redisUtil.get("sysuser"+2);
        return "SUCCESS";
    }
}
