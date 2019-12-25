package com.atguigu.demo0715.controller;

import com.atguigu.demo0715.bean.UserInfo;
import com.atguigu.demo0715.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    // 调用服务层
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    /*
    // select * from userInfo where id = ?
    // select * from userInfo where loginName = ?
    // select * from userInfo where name = ?
    // select * from userInfo where name = ? and id = ?
    // select * from userInfo;
     */
    // springmvc 对象传值！
    // localhost:8080/findByUserInfo?id=xx
    @RequestMapping("findByUserInfo")
    public List<UserInfo> findByUserInfo(UserInfo userInfo){
        return userService.findByUserInfo(userInfo);
    }

    // select * from userInfo where loginName like %?%;
    // localhost:8080/findByUser?loginName=xx
    @RequestMapping("findByUser")
    public List<UserInfo> findByUser(UserInfo userInfo){

        return userService.findByUser(userInfo);
    }
    // localhost:8080/addUser?loginName=zs&nickName=zhangsan&name=张三
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        System.out.println("==="+userInfo.getId());
        userService.addUser(userInfo);
        System.out.println("主键："+userInfo.getId());
    }

    // localhost:8080/updUser?id=4&name=张无忌
    // localhost:8080/updUser?name=张三&loginName=zhangs
    @RequestMapping("updUser")
    public void updUser(UserInfo userInfo){

        // userService.updUser(userInfo);
        userService.updUser(userInfo);

    }
    // localhost:8080/delUser?id=4
    @RequestMapping("delUser")
    public void delUser(UserInfo userInfo){

        // userService.updUser(userInfo);
        userService.delUser(userInfo);

    }
}
