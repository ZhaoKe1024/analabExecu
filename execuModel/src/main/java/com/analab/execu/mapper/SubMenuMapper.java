package com.analab.execu.mapper;

import com.analab.execu.bean.SubMenu;

public interface SubMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SubMenu record);

    int insertSelective(SubMenu record);

    SubMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SubMenu record);

    int updateByPrimaryKey(SubMenu record);
}