package com.bigfacekitty.service.impl;


import com.bigfacekitty.entity.Dome;
import com.bigfacekitty.mapper.DomeDaoMapper;
import com.bigfacekitty.service.DomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @creator wangli66
 * @create-time 17:17 2019/12/26
 **/
@Service
public class DomeServiceImpl implements DomeService {

    @Autowired
    private DomeDaoMapper domeDaoMapper;

    @Override
    public String testInterceptor(String param) {
        return "测试拦截器：" + param;
    }

    @Override
    public Dome findById(Dome dome) {
        final List<String> byId = domeDaoMapper.findHabitsById();
        return null;
    }

    @Override
    public List<Dome> findAll() {
        return domeDaoMapper.findAll();
    }

    @Override
    public void insertDome(Dome dome) {
        domeDaoMapper.insertDome(dome);
    }


}