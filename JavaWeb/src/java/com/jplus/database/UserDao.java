package com.jplus.database;

import com.jplus.bean.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.*;

/**
 * Created by BLAME on 2017/10/28.
 */
public class UserDao {

    /*public boolean insert(User user){
        String sql = "insert into user (username,pass,age) values ("
                +",'"+user.getUsername()+"'"
                +",'"+user.getPass()+"'"
                //+",'"+user.getSex()+"'"
                +","+user.getAge()+""
                //+",'"+user.getPhone()+"'"
               // +",'"+user.getEmail()+"'"
                //+",'"+user.getAddress()+"'"
                +")";
        DatabaseMysql db = new DatabaseMysql();
        boolean b = db.update(sql);
        db.close();
        return b;
    }*/
    public boolean insert(User user) {
        String sql = "insert into user (username,pass,sex,age,phone,email,address) values("
                + "'" + user.getUsername() + "'"
                + ",'" + user.getPass() + "'"
                + ",'"+user.getSex()+ "'"
                + "," + user.getAge() + ""
                 + ",'"+user.getPhone()+ "'"
                +",'"+user.getEmail()+"'"
                +",'"+user.getAddress()+"'"
                + ")";
        DatabaseMysql db = new DatabaseMysql();
        boolean b = db.update(sql);
        db.close();
        return b;
    }

    public boolean check(User user) throws SQLException {
        String sql = "select * from user where username='"+user.getUsername()+"'";
        DatabaseMysql db = new DatabaseMysql();
        db.query(sql);
        boolean b = db.isResultSetNull();
        db.close();
        return b;
    }

    public User getUser(String username) throws SQLException {
        String sql = "select * from user where username=" + "'" +username+"'";
        DatabaseMysql db = new DatabaseMysql();
        ResultSet rs = db.query(sql);
        User user = new User();
        try {
            if (rs != null && rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPass(rs.getString("pass"));
                user.setSex(rs.getString("sex"));
                user.setAge(rs.getInt("age"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(SEVERE, null, ex);
        }
        db.close();
        return user;
    }

    public boolean login(User user) throws SQLException {
        String sql = "select * from user where username='" + user.getUsername() + "' and pass='" + user.getPass() + "'";
        DatabaseMysql db = new DatabaseMysql();
        db.query(sql);
        boolean b = db.isResultSetNull();
        db.close();
        return b;
    }


}
