package com.weixiao.wxpersistent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.weixiao.wxpersistent.*")
public class WxPersistentApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxPersistentApplication.class, args);
	}
}
