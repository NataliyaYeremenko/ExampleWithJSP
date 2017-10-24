<%--
  Created by IntelliJ IDEA.
  User: Nataliya
  Date: 11.09.2017
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task3</title>
</head>
<body>
    <form action="AddNameServlet" method="get">
        <input name="login"><br><br><br>
        <input type="submit" value="AddName">
        <br><br><br>
    </form>
    <form action="remove.jsp">
        <input type="submit" value="Remove">
    </form>
    <c:if test="${not empty sessionScope.list}">
        <c:forEach items="${list}" var="login">${login}<br></c:forEach>
    </c:if>
</body>
</html>
