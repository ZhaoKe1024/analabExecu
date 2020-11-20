package com.analab.execu.mapper;

import com.analab.execu.bean.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String studentid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String studentid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}