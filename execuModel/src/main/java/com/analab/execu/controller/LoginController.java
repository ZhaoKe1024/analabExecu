package com.analab.execu.controller;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.analab.execu.bean.Admin;
import com.analab.execu.mapper.AdminMapper;

@Slf4j
// Specifies that the entire controller return value is of string type
// 规定整个Controller返回值都是String类型
@CrossOrigin(origins = "*", maxAge = 3600) 
@RestController
public class LoginController {

	// 自动注入
	@Autowired
	AdminMapper adminMapper;
	
	// The requestbody annotation is added so that it can be found
	// 为了让它能够找到而加上RequestBody注解
	// 创建访问路径login
	@RequestMapping("/login")
	//从前台请求到的Admin对象
	public String login(@RequestBody Admin admin) {
		String flag = "error";
		if (admin != null) {
			System.out.println("接收到的数据admin："+admin.toString());
		}else {
			System.out.println("package com.analab.execu.controller login 接收到admin为空！");
		}
		Map<String, String> info = new HashMap<String, String>();
		info.put("adminid", admin.getAdminid());
		info.put("password", admin.getPassword());
		Admin us = adminMapper.selectByNamePasswd(info);
		
		if (us != null) {
			flag = "OK";
			System.out.println("接受到的数据：" + us.toString());
		}else {
			System.out.println("package com.analab.execu.controller login 查询为空！");
		}
		HashMap<String, Object> res = new HashMap<>();
		res.put("flag", flag);
		res.put("user", admin);
		String res_json = JSON.toJSONString(res);
		log.info(admin.getAdminid());
//		log.info(admin.getPassword());
		return res_json;
	}
}
