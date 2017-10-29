package com.jplus.action;;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.jplus.database.UserDao;
import com.jplus.bean.User;

/**
 * Created by BLAME on 2017/10/28.
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/Add.jsp"})
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        User user = new User();
        UserDao userdao = new UserDao();
        user.setUsername(request.getParameter("username"));
        user.setPass(request.getParameter("pass"));
        String repass = request.getParameter("repass");
        user.setSex(request.getParameter("sex"));
        try {
            user.setAge(Integer.parseInt(request.getParameter("age")));
        } catch (NumberFormatException numberFormatException) {
        }
        user.setPhone(request.getParameter("phone"));
        user.setEmail(request.getParameter("email"));
        user.setAddress(request.getParameter("address"));
        String notice = "";//返回信息
        //判空
        if (!user.getPass().equals("") && !repass.equals("") && !user.getUsername().equals("")) {
            //验证两次密码
            if (user.getPass().equals(repass)) {
                try {
                    if (!userdao.check(user)) {//验证用户名重复
                        if (userdao.insert(user)) {
                            notice = "注册成功！";
                        } else {
                            notice = "注册失败！";
                        }
                    } else {
                        notice = "用户名已经存在请更换！";
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                notice = "两次密码不一致！";
            }
        } else {
            notice = "请将信息填写完整！";
        }
        request.setAttribute("notice", notice);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}

   

