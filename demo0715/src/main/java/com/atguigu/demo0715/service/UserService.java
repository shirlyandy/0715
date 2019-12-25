package com.atguigu.demo0715.service;

import com.atguigu.demo0715.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户数据
     * @return
     */
    List<UserInfo> findAll();

    // 根据用户输入的条件进行查询，如果没有输入任何条件则查询所有！
    // select * from userInfo where id = ?
    // select * from userInfo where loginName = ?
    // select * from userInfo where name = ?
    // select * from userInfo where name = ? and id = ?
    // select * from userInfo;
    List<UserInfo> findByUserInfo(UserInfo userInfo);

    // 模糊查询或者范围匹配
    // select * from userInfo where loginName like %?%;
    List<UserInfo> findByUser(UserInfo userInfo);

    // 用户登录
    // select * from userInfo where loginName = ? and pwd =？
    UserInfo login(UserInfo userInfo);

    // 用户注册
    void addUser(UserInfo userInfo);

    // 按照id 修改
    void updUser(UserInfo userInfo);
    // 删除用户数据
    void delUser(UserInfo userInfo);
}
