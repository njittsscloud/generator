package com.sks.basic.simple.service.dao;

import com.sks.basic.simple.service.model.Test;

public interface TestDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}