package com.aiauthmng.group.web;

import com.aiauthmng.group.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 组织操作相关ctl
* 组织操作相关ctl
* @author chaoyalong
* @date 2018-5-27 15:52
*/
@RestController
@RequestMapping("/group")
public class GroupController {

    private static final Logger logger = LoggerFactory.getLogger(GroupController.class);

    @Autowired
    GroupService service;
}
