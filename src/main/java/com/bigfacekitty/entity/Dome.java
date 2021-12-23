package com.bigfacekitty.entity;


import lombok.Data;

import java.util.List;

/**
 * @creator wangli66
 * @create-time 9:59 2019/12/27
 **/
@Data
public class Dome {
    private Integer id;
    private String name;
    private String nickName;
    private String companyName;
    private String companyId;
    private String password;
    private Integer status;
    private List<String> habits;
}