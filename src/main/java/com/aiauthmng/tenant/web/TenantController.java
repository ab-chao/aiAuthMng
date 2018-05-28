package com.aiauthmng.tenant.web;

import com.aiauthmng.tenant.service.TenantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 租户操作相关ctl
* 租户操作相关ctl
* @author chaoyalong
* @date 2018-5-27 15:52
*/
@RestController
@RequestMapping("/tenant")
public class TenantController {

    private static final Logger logger = LoggerFactory.getLogger(TenantController.class);

    @Autowired
    TenantService service;
}
