package com.analab.execu.mapper;

import com.analab.execu.bean.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(String classid);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(String classid);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}