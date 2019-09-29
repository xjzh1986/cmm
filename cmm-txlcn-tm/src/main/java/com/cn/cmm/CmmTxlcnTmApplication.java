package com.cn.cmm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class CmmTxlcnTmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmmTxlcnTmApplication.class, args);
	}

}
