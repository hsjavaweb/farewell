package com.jplus.action;

import com.jplus.bean.User;
import com.jplus.database.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by BLAME on 2017/10/28.
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login.jsp"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String pass=request.getParameter("pass");
        UserDao userdao=new UserDao();
        User user=new User();
        user.setPass(pass);
        user.setUsername(username);
        boolean b = false;
        try {
            b = userdao.login(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        User usermessage = new User();


        String notice="登录失败！";
        if(b){
            notice="登录成功！";
            try {
                usermessage = userdao.getUser(username);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("usermessage", usermessage);
            request.getRequestDispatcher("user.jsp").forward(request, response);
        }
        request.setAttribute("notice", notice);
        request.getRequestDispatcher("login.jsp").forward(request, response);

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
