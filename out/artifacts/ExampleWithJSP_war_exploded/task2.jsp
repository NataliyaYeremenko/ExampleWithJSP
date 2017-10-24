<%--
  Created by IntelliJ IDEA.
  User: Nataliya
  Date: 11.09.2017
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel = "stylesheet" href = "css/table.css">
    <title>Practice10_Task2</title>
  </head>
  <body>
    <table>
      <tr><td></td>
        <c:forEach begin = "1" end = "9" var = "i">
        <td>${i}</td>
        </c:forEach>
      </tr>
      <c:forEach begin = "1" end = "9" var = "i">
        <tr>
          <td>${i}</td>
        <c:forEach begin = "1" end = "9" var = "j">
          <td>${i*j}</td>
        </c:forEach>
      </tr>
      </c:forEach>
    </table>
  </body>
</html>
