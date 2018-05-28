package com.aiauthmng.tenant.service;

import com.aiauthmng.tenant.dao.TenantDao;
import com.aiauthmng.tenant.entity.TenantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* 租户相关service
* 租户相关service
* @author chaoyalong
* @date 2018-5-27 15:41
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class TenantServiceImpl implements TenantService {

    @Autowired
    TenantDao dao;

    @Override
    public void insertTenant(TenantEntity entity) {
        dao.insertTenant(entity);
    }

    @Override
    public void deleteTenant(TenantEntity entity) {
        dao.deleteTenant(entity);
    }

    @Override
    public void updateTenant(TenantEntity entity) {
        dao.updateTenant(entity);
    }

    @Override
    public List<TenantEntity> getTenants(TenantEntity entity) {
        return dao.getTenants(entity);
    }

}
