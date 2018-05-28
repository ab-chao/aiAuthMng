package com.aiauthmng.group.dao;

import com.aiauthmng.group.entity.GroupEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* 组织相关dao
* 组织相关dao
* @author chaoyalong
* @date 2018-5-27 15:43
*/
@Mapper
public interface GroupDao {
    /**
     * @desc 插入一个group
     * 插入一个group
     *
     * @param entity
     * @date 2018年5月27日 15:40
     * @exception
     */
    void insertGroup(GroupEntity entity);

    /**
     * @desc 删除一个group
     * 删除一个group
     *
     * @param entity
     * @date 2018年5月27日 15:40
     * @exception
     */
    void deleteGroup(GroupEntity entity);

    /**
     * @desc 更新一个group
     * 更新一个group
     *
     * @param entity
     * @date 2018年5月27日 15:40
     * @exception
     */
    void updateGroup(GroupEntity entity);

    /**
     * @desc 查询group
     * 查询group
     *
     * @param entity
     * @date 2018年5月27日 15:45
     * @return com.aiauthmng.group.entity.GroupEntity
     * @exception
     */
    List<GroupEntity> getGroups(GroupEntity entity);
}
