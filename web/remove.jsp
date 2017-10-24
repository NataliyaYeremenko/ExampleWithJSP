<%--
  Created by IntelliJ IDEA.
  User: Nataliya
  Date: 11.09.2017
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
 <%
     ((java.util.List)session.getAttribute("list")).clear();
 %>
<jsp:forward page="task3.jsp"></jsp:forward>
</body>
</html>
