package com.tss.report.services.task.dao;

import com.tss.report.services.task.po.TaskClass;

public interface TaskClassDao {
    int deleteByPrimaryKey(Long id);

    int insert(TaskClass record);

    int insertSelective(TaskClass record);

    TaskClass selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskClass record);

    int updateByPrimaryKey(TaskClass record);
}