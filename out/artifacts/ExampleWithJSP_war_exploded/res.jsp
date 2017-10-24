<%--
  Created by IntelliJ IDEA.
  User: Nataliya
  Date: 11.09.2017
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Practice10_Tasks1-3</title>
</head>
<body>
<H3>You are logged as
    <%=(String) request.getAttribute("role") %>
    <%=(String) request.getAttribute("user")%></H3>
<h2>
    <a href="task1.jsp">Part1</a>
    <br>
    <a href="task2.jsp">Part2</a>
    <br>
    <a href="task3.jsp">Part3</a>
    <br>
</h2>
<form method="post" action="SendNameServlet">
    <input type="hidden" name="cmd" value=<%= (String) request.getAttribute("user") %>>
    <input type="submit" class="hyperlink" value="Part4">
    <br>
</form>
</body>
</html>
