package com.aiauthmng.user.entity;

/**
* 用户实体
* 用户实体
* @author chaoyalong
* @date 2018-5-25 11:02
*/
public class UserEntity {

    private int id;
    private String name;
    private String roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
