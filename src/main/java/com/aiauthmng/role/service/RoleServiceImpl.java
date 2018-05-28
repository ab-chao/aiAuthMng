package com.aiauthmng.role.service;

import com.aiauthmng.role.dao.RoleDao;
import com.aiauthmng.role.entity.Role;
import com.aiauthmng.role.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色相关Service
 * 角色相关Service
 * @author chaoyalong
 * @date 2018-5-25 15:14
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleDao dao;

    @Override
    public void insertRole(RoleEntity entity) {
        dao.insertRole(entity);
    }

    @Override
    public void deleteRole(RoleEntity entity) {
        dao.deleteRole(entity);
    }

    @Override
    public void updateRole(RoleEntity entity) {
        dao.updateRole(entity);
    }

    @Override
    public List<RoleEntity> getRoles(RoleEntity entity) {
        return dao.getRoles(entity);
    }
}
