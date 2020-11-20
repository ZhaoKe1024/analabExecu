package com.analab.execu.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.analab.execu.bean.MainMenu;


@Repository
public interface MenuMapper {
	public List<MainMenu> getMenus();  // 获取菜单
}
