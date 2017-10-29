<%--
  Created by IntelliJ IDEA.
  User: BLAME
  Date: 2017/10/28
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<center>
    <h1>
        ******用户注册登陆******
    </h1>
    <tr>
        <td><a href="index.jsp">首页</a></td>
        <td><a href="add.jsp">用户注册</a> </td>
        <td><a href="login.jsp">用户登陆</a> </td>
    </tr>


</center>
<%String notice=(String)request.getAttribute("notice");%>
<%if(notice!=null){%><%=notice%><%}%>
</body>
</html>
