package com.sks.basic.simple.service.dao;

import com.sks.basic.simple.service.model.Test;
import com.sks.basic.simple.service.model.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDao {
    int countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}