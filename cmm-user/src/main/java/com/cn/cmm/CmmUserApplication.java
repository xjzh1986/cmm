package com.cn.cmm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.cn.cmm.mapper")
@SpringBootApplication(scanBasePackages = "com.cn.cmm")
public class CmmUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmmUserApplication.class, args);
	}

}
