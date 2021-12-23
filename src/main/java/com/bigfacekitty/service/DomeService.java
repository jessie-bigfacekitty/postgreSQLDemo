package com.bigfacekitty.service;


import com.bigfacekitty.entity.Dome;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @creator wangli66
 * @create-time 17:14 2019/12/26
 **/
@Service
public interface DomeService {

    String testInterceptor(String param);
    Dome findById(Dome dome);
    List<Dome> findAll();
    void insertDome(Dome dome);

}