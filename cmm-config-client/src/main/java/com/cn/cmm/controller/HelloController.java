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

    @Value("${spring.config.rabbitmq.host}")
    private String rabbitmq_host;

    @Value("${spring.config.rabbitmq.port}")
    private String rabbitmq_port;

    @Value("${spring.config.rabbitmq.username}")
    private String rabbitmq_username;

    @Value("${spring.config.rabbitmq.password}")
    private String rabbitmq_password;



    @RequestMapping("/hello")
    public String hello() {
        return this.hello;
    }
}
