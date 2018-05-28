package com.aiauthmng.group.service;

import com.aiauthmng.group.dao.GroupDao;
import com.aiauthmng.group.entity.GroupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* 组织相关service
* 组织相关service
* @author chaoyalong
* @date 2018-5-27 15:41
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupServiceImpl implements GroupService{

    @Autowired
    GroupDao dao;

    @Override
    public void insertGroup(GroupEntity entity) {
        dao.insertGroup(entity);
    }

    @Override
    public void deleteGroup(GroupEntity entity) {
        dao.deleteGroup(entity);
    }

    @Override
    public void updateGroup(GroupEntity entity) {
        dao.updateGroup(entity);
    }

    @Override
    public List<GroupEntity> getGroups(GroupEntity entity) {
        return dao.getGroups(entity);
    }
}
