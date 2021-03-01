package com.cykj.jx2008springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import sun.awt.SunHints;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by Wzh on 2021/3/1 11:10
 */
@Controller
@RequestMapping("file")
public class FileController {

    @RequestMapping("/fileUpload")
    public String upload(){
        return "fileUpload";
    }

    // 2.文件上传，ftp文件上传服务器
    @RequestMapping(value="/upload", method = RequestMethod.POST)
    public String uploadFile(HttpServletRequest request, MultipartFile uploadFile)
        throws Exception{

        if (uploadFile.getSize() > 0) {

            // 获取前半部分路径，将webRoot/target下建一个名称为upload文件夹，转换成绝对路径
//            String path = request.getServletContext().getRealPath("/upload");
            String path = "C:\\software\\ideaProject\\jx2008spring-boot\\upload";
            // 判断文件夹是否存在,如果不存在则进行创建
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
            // 获取文件名作为保存到服务器的文件名称(实际项目中,用户上传的文件名是用一连串不重复的文件名称)
            String fileName = uploadFile.getOriginalFilename();
            // 03.路径拼接
            file = new File(path, fileName);

            // 文件名要存入数据库中
                // 用户文件名 实际存储路径

            uploadFile.transferTo(file);
            return "index";

        }
        return "";
    }

}
