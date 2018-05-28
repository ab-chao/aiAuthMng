package com.aiauthmng.user.web;

import com.aiauthmng.user.entity.UserEntity;
import com.aiauthmng.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * user相关CTL
 * user相关CTL
 * @author chaoyalong
 * @date 2018-5-25 11:01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService service;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers(UserEntity user) {
        List<UserEntity> users = null;
        try {
            users = service.getUsers(user);
        } catch (Exception e) {
            logger.error("查询用户信息出错",e);
        }
        return users;
    }
}
