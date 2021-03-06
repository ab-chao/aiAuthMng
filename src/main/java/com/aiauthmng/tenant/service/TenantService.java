package com.aiauthmng.tenant.service;

import com.aiauthmng.tenant.entity.TenantEntity;

import java.util.List;

/**
 * 租户操作相关service
 * 租户操作相关service
 * @author chaoyalong
 * @date 2018-5-27 15:36
 */
public interface TenantService {

    /**
    * @desc 新增一个租户
    * 新增一个租户
    *
    * @param entity
    * @date 2018年5月27日 15:59
    * @exception
    */
    void insertTenant(TenantEntity entity);

    /**
     * @desc 删除一个租户
     * 删除一个租户
     *
     * @param entity
     * @date 2018年5月27日 15:59
     * @exception
     */
    void deleteTenant(TenantEntity entity);

    /**
    * @desc 更新一个租户
    * 更新一个租户
    *
    * @param entity
    * @date 2018年5月27日 15:59
    * @exception
    */
    void updateTenant(TenantEntity entity);

    /**
    * @desc 查询租户
    * 查询租户
    *
    * @param entity
    * @date 2018年5月27日 16:00
    * @return com.aiauthmng.tenant.entity.TenantEntity
    * @exception
    */
    List<TenantEntity> getTenants(TenantEntity entity);

}
