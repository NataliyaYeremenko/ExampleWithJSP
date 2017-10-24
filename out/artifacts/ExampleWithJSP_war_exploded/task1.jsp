<%--
  Created by IntelliJ IDEA.
  User: Nataliya
  Date: 09.09.2017
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel = "stylesheet" href = "css/table.css">
    <title>Practice10_Task1</title>
  </head>
  <body>
      <table>
        <tr><td></td>
          <% for (int i = 1; i <= 9; i++){ %>
            <td><%= i %></td>
          <%}%>
        </tr>
        <tr>
          <% for (int i = 1; i <= 9; i++){ %>
            <td><%= i %></td>
            <% for (int j = 1; j <=9; j++){ %>
              <td><%=i*j%></td>
            <%}%>
          </tr>
        <%}%>
      </table>
  </body>
</html>
