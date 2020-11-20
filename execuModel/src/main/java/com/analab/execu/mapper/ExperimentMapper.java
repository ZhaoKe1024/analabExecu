package com.analab.execu.mapper;

import com.analab.execu.bean.Experiment;

public interface ExperimentMapper {
    int deleteByPrimaryKey(String experid);

    int insert(Experiment record);

    int insertSelective(Experiment record);

    Experiment selectByPrimaryKey(String experid);

    int updateByPrimaryKeySelective(Experiment record);

    int updateByPrimaryKey(Experiment record);
}