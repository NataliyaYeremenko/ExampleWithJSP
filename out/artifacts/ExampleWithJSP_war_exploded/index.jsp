<%--
  Created by IntelliJ IDEA.
  User: Nataliya
  Date: 11.09.2017
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="loginForm" method="post" action="LoginServlet">
    <input type="hidden" name="cmd" value="login">
    Login:<br>
    <input type="text"
           name="login"
           value=""><br>
    Password:<br>
    <input type="password"
           name="password"
           value=""><br>
    <br>
    <br>
    <input type="submit" value="Enter">
</form>

</body>
</html>
