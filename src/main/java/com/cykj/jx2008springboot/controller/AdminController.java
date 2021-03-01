package com.cykj.jx2008springboot.controller;

import com.cykj.jx2008springboot.entity.Admin;
import com.cykj.jx2008springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Wzh on 2021/3/1 10:38
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("insertAdmin")
    public String insertAdmin(){
        Admin admin = new Admin();
        admin.setAdminAccount("哈哈哈");
        adminService.insertAdmin(admin);
        return "index";
    }

    @RequestMapping("selectAdminList")
    public String selectAdminList(String adminAccount){

        Admin admin = new Admin();
        admin.setAdminAccount("admin");
        System.out.println("adminService: " + adminService.selectAdminList(admin));
        return "index";
    }

}
