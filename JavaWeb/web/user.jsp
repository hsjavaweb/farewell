
<%--
  Created by IntelliJ IDEA.
  User: BLAME
  Date: 2017/10/27
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page  import="java.util.*" %>
<%@page  import="com.jplus.bean.User" %>
<%User user=(User)request.getAttribute("usermessage");%>
     
<html>
<head>
    <title>user</title>
</head>
<body>
<center>
    <h1>用户信息</h1>
    <table border="1">
        <tr>
            <td>Id</td>
            <td><%=user.getId()%></td>
        </tr>
        <tr>
            <td>用户名</td>
            <td><%=user.getUsername()%></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><%=user.getSex()%></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><%=user.getAge()%></td>
        </tr>
        <tr>
            <td>手机</td>
            <td><%=user.getPhone()%></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><%=user.getEmail()%></td>     
        </tr>
          <tr>
            <td>地址</td>
            <td><%=user.getAddress()%></td>     
        </tr>
    </table>
        <%String notice=(String)request.getAttribute("notice");%>
    <%if(notice!=null){%><%=notice%><%}%>

</center>

</body>
</html>
