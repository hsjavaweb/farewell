package com.jplus.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by BLAME on 2017/10/28.
 */
public class DatabaseMysql {
    public static final String url = "jdbc:mysql://127.0.0.1/t1";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "0123684.";

    private Connection conn = null;
    private Statement stm = null;
    private ResultSet rs = null;

    /*
   开启数据库连接
     */
    public DatabaseMysql(){
        try {
            Class.forName(name);
            conn = DriverManager.getConnection(url, user, password);
            stm = conn.createStatement();
        }catch (Exception Exception) {
            Logger.getLogger(DatabaseMysql.class.getName()).log(Level.SEVERE, null, Exception);
        }
    }

    /**
     * 数据库查询
     *
     * @param sql sql语句
     * @return 查询集合
     */
    public ResultSet query(String sql) throws SQLException {
        try {
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    /**
     * 数据库更新操作
     *
     * @param sql sql语句
     * @return 是否成功
     */
    public boolean update(String sql) {
        boolean b = false;
        try {
            stm.execute(sql);
            b = true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    /**
     * 判断查询集合是否为空
     *
     * @return 如果为空false有数据库返回true
     */
    public boolean isResultSetNull() {
        try {
            if (rs != null && rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * 关闭数据库连接
     */
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
