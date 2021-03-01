package com.cykj.jx2008springboot.service;

import com.cykj.jx2008springboot.entity.Admin;

import java.util.List;

/**
 * Created by Wzh on 2021/3/1 10:26
 */
public interface AdminService {

    List<Admin> selectAdminList(Admin admin);

    void insertAdmin(Admin admin);

}
