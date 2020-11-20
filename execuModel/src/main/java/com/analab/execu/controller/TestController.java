package com.analab.execu.controller;

import com.analab.execu.bean.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;

@Slf4j
// 整个Controller的返回值都是字符串，这个注解会命令我们返回的都是字符串
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("test my controller, it's ok");
		Student student= new Student();
		student.setName("walt");
		log.info(student.getName());
		return "test my testController";
	}
}
