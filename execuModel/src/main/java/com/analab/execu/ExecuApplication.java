package com.analab.execu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.analab.execu.mapper")
@SpringBootApplication
public class ExecuApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExecuApplication.class, args);
	}

}
