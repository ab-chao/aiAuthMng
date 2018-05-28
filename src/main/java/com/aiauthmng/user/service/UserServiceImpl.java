package com.aiauthmng.user.service;

import com.aiauthmng.user.dao.UserDao;
import com.aiauthmng.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 用户相关Service
* 用户相关Service
* @author chaoyalong
* @date 2018-5-25 12:10
*/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao dao;

    @Override
    public void insertUser(UserEntity entity) {
        dao.insertUser(entity);
    }

    @Override
    public void deleteUser(UserEntity entity) {
        dao.deleteUser(entity);
    }

    @Override
    public void updateUser(UserEntity entity) {
        dao.updateUser(entity);
    }

    @Override
    public List<UserEntity> getUsers(UserEntity entity) {
        return dao.getUsers(entity);
    }
}
