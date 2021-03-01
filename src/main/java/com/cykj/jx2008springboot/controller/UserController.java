package com.cykj.jx2008springboot.controller;

import com.cykj.jx2008springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Wzh on 2021/3/1 9:38
 */

@Controller
public class UserController {

//    @RequestMapping("index")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("index")
    public ModelAndView AdminLogin(){
        ModelAndView modelAndView = new ModelAndView("index");
        // addObject相当于request.setAttribute
        modelAndView.addObject("time", new Date());
        modelAndView.getModel().put("name", "晓磊");
        return modelAndView;
    }

}
