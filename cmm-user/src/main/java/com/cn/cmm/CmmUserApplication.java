package com.cn.cmm;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDistributedTransaction
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.cn.cmm.mapper")
@SpringBootApplication(scanBasePackages = "com.cn.cmm")
public class CmmUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmmUserApplication.class, args);
	}

}
