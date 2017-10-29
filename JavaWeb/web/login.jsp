<%--
  Created by IntelliJ IDEA.
  User: BLAME
  Date: 2017/10/28
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<center>
    <h1>***登陆***</h1>
    <form action="Login.jsp" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username" size="20" maxlength="32"></td>
        </tr>

        <tr>
            <td>用户密码</td>
            <td><input type="password" name="pass" size="20" maxlength="32"></td>
        </tr>
        <tr>
            <td><input type="reset" value="重新登陆"></td>
            <td><input type="submit"value="确认登陆"></td>
        </tr>
    </table>
    </form>
    <%String notice=(String)request.getAttribute("notice");%>
    <%if(notice!=null){%><%=notice%><%}%>
</center>


</body>
</html>
