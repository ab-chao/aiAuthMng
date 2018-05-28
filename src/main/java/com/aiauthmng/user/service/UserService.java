package com.aiauthmng.user.service;

import com.aiauthmng.user.entity.UserEntity;

import java.util.List;

/**
* 用户相关Service
* 用户相关Service
* @author chaoyalong
* @date 2018-5-25 12:06
*/
public interface UserService {

    /**
    * @desc 插入一个用户
    * 插入一个用户
    *
    * @param entity
    * @date 2018年5月27日 16:29
    * @exception
    */
    void insertUser(UserEntity entity);

    /**
     * @desc 删除一个用户
     * 删除一个用户
     *
     * @param entity
     * @date 2018年5月27日 16:29
     * @exception
     */
    void deleteUser(UserEntity entity);

    /**
     * @desc 更新一个用户
     * 更新一个用户
     *
     * @param entity
     * @date 2018年5月27日 16:29
     * @exception
     */
    void updateUser(UserEntity entity);

    /**
    * @desc 查询用户
    * 查询用户
    *
    * @param entity
    * @date 2018年5月27日 16:29
    * @return java.util.List<com.aiauthmng.user.entity.UserEntity>
    * @exception
    */
    List<UserEntity> getUsers(UserEntity entity);
}
