package com.aiauthmng.role.web;

import com.aiauthmng.role.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 角色操作相关ctl
* 角色操作相关ctl
* @author chaoyalong
* @date 2018-5-27 16:17
*/
@RestController
@RequestMapping("/role")
public class RoleController {

    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    RoleService service;
}
