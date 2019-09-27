package com.cn.cmm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class HelloController {

    @Value("${spring.config.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String hello() {
        return this.hello;
    }
}
