package com.travel.service;

import com.travel.service.domain.Permission;
import com.travel.service.domain.Role;

import java.util.List;

public interface IPermissionService {
    public List<Permission> findAll(int page, int size) throws Exception;

    void save(Permission permission) throws Exception;

}
