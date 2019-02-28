package com.jk.dao;


import com.jk.entity.Attends;

import java.util.List;

public interface AttendsMapper {
    int deleteByPrimaryKey(Long attendsId);

    int insert(Attends record);

    int insertSelective(Attends record);

    Attends selectByPrimaryKey(Long attendsId);

    int updateByPrimaryKeySelective(Attends record);

    int updateByPrimaryKey(Attends record);

    List<Attends> attendsList(Attends attends);
}