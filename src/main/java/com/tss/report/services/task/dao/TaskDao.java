package com.tss.report.services.task.dao;

import com.tss.report.services.task.po.Task;

public interface TaskDao {
    int deleteByPrimaryKey(Long id);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}