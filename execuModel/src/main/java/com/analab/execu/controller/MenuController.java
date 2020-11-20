package com.analab.execu.controller;

import java.util.HashMap;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.analab.execu.bean.MainMenu;
import com.analab.execu.mapper.MenuMapper;
@RestController
public class MenuController {

	@Autowired
	MenuMapper menuDao;
	
	@CrossOrigin
	@RequestMapping("/menus")
	public String getAllMenus() {
		HashMap<String, Object> data = new HashMap<>();
//		状态 错误404 成功200
		List<MainMenu> menus = menuDao.getMenus();
		if(menus!=null) {
			data.put("menus", menus);
			data.put("status", 200);
			System.out.println("com.analab.execu.controller MenuController/menus 查询结果[0]："+menus.get(0).toString());
		}else {
			data.put("status", 404);
			System.out.println("com.analab.execu.controller MenuController/menus 查询结果为空！");
		}
		String data_json = JSON.toJSONString(data);
		System.out.println("访问成功！！");
		return data_json;
	}

}
