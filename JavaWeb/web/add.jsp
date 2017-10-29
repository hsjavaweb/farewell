<%--
  Created by IntelliJ IDEA.
  User: BLAME
  Date: 2017/10/27
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<center>
    <h1>添加用户</h1>
    <form action="Add.jsp" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" size="20" maxlength="20"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="pass" size="20" maxlength="32"/></td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td><input type="password" name="repass" size="20" maxlength="32"/></td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <select name = "sex" style="width: 150px;">
                        <option value="man">男</option>
                        <option value="women">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age" size="20" maxlength="3"/></td>
            </tr>
            <tr>
                <td>电话</td>
                <td><input type="text" name="phone" size="20" maxlength="32"/></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email" size="20" maxlength="32"/></td>
            </tr>
            <tr>
                <td>地址</td>
                <td><input type="text" name="address" size="20" maxlength="8"/></td>
            </tr>
            <tr>
                <td><input type="reset"  value="重置"/></td>
                <td><input type="submit"  value="提交"/></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
