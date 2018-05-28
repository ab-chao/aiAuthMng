package com.aiauthmng.role.service;

import com.aiauthmng.role.entity.RoleEntity;

import java.util.List;

/**
* 角色相关Service
* 角色相关Service
* @author chaoyalong
* @date 2018-5-25 15:14
*/
public interface RoleService {

    /**
    * @desc 新增一个role实体
    * 新增一个role实体
    *
    * @param entity
    * @date 2018年5月27日 16:09
    * @exception
    */
    void insertRole(RoleEntity entity);

    /**
     * @desc 删除一个role实体
     * 删除一个role实体
     *
     * @param entity
     * @date 2018年5月27日 16:09
     * @exception
     */
    void deleteRole(RoleEntity entity);

    /**
     * @desc 更新一个role实体
     * 更新一个role实体
     *
     * @param entity
     * @date 2018年5月27日 16:09
     * @exception
     */
    void updateRole(RoleEntity entity);

    /**
    * @desc 查询角色
    * 查询角色
    *
    * @param entity
    * @date 2018年5月27日 16:10
    * @return java.util.List<com.aiauthmng.role.entity.RoleEntity>
    * @exception
    */
    List<RoleEntity> getRoles(RoleEntity entity);
}
