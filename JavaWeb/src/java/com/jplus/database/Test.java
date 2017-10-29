package com.jplus.database;

import com.jplus.bean.User;

import java.sql.SQLException;

/**
 * Created by BLAME on 2017/10/28.
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        
        UserDao userdao = new UserDao();
        User user = new User();
        user.setUsername("1");
        user.setPass("1");
        user.setSex("s");
        user.setAge(23);
        user.setPhone("sad");
        user.setEmail("sada");
        user.setAddress("dawdwa");
        System.out.println(userdao.insert(user));
        
        
        
    

}}
