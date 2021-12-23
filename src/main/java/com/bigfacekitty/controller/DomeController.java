package com.bigfacekitty.controller;

import com.bigfacekitty.entity.Dome;
import com.bigfacekitty.service.DomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @creator wangli66
 * @create-time 11:06 2019/12/3
 **/
@RestController
@RequestMapping("/dome")
public class DomeController {

    @Autowired
    private DomeService domeService;

    @RequestMapping("/testInterceptor")
    public String testInterceptor(String param) {
        return domeService.testInterceptor(param);
    }

    @PostMapping("/findDome")
    public String findDome(@RequestBody Dome dome) {

        return domeService.findById(dome).toString();
    }

    @RequestMapping("/findAll")
    public List<Dome> findAll() {
        return domeService.findAll();
    }

    @RequestMapping("/insert")
    public void insert(Dome dome) {
        domeService.insertDome(dome);
    }
}