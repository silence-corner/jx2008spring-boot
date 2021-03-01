package com.cykj.jx2008springboot.mapper;

import com.cykj.jx2008springboot.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wzh on 2021/3/1 10:33
 */
@Repository
public interface AdminMapper {

    List<Admin> selectAdminList(Admin admin);

    void insertAdmin(Admin admin);

    void insertAdmins(Admin admin);

}
