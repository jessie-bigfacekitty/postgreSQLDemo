package com.bigfacekitty.mapper;


import com.bigfacekitty.entity.Dome;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @creator wangli66
 * @create-time 9:58 2019/12/27
 **/
public interface DomeDaoMapper {
    void insertDome(@Param("dome") Dome dome);
    Dome findById(@Param("dome")Dome dome);
    List<String> findHabitsById();
    List<Dome> findAll();
}