package com.cykj.jx2008springboot.service.impl;

import com.cykj.jx2008springboot.entity.Admin;
import com.cykj.jx2008springboot.mapper.AdminMapper;
import com.cykj.jx2008springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Wzh on 2021/3/1 10:26
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> selectAdminList(Admin admin) {
        return adminMapper.selectAdminList(admin);
    }

    @Override
    @Transactional
    public void insertAdmin(Admin admin) {
        adminMapper.insertAdmin(admin);
        adminMapper.insertAdmins(admin);
    }

}
