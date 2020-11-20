package com.analab.execu.mapper;

import com.analab.execu.bean.SelectSubject;

public interface SelectSubjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SelectSubject record);

    int insertSelective(SelectSubject record);

    SelectSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SelectSubject record);

    int updateByPrimaryKey(SelectSubject record);
}