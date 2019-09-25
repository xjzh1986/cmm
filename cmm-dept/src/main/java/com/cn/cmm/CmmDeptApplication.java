package com.cn.cmm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.cn.cmm.mapper")
@SpringBootApplication(scanBasePackages = "com.cn.cmm")
public class CmmDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmmDeptApplication.class, args);
	}

}
