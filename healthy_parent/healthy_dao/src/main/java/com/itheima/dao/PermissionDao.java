package com.itheima.dao;

import com.itheima.pojo.Permission;

import java.util.Set;

public interface PermissionDao {
    /**
     * 根据角色id查找权限
     * @param id
     * @return
     */
    Set<Permission> findPerByRoleId(Integer id);
}
