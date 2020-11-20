package com.analab.execu.mapper;

import java.util.Map;

import com.analab.execu.bean.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);
    
    Admin selectByNamePasswd(Map<String, String> map);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}