<%--
  Created by IntelliJ IDEA.
  User: Luis
  Date: 30/03/2021
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
    <h2>Spring Application Main Page</h2>
    <hr>
    <br><br>
    <a href="${pageContext.request.contextPath}/hello/showForm">Hello world form</a>
    <br><br>
    <a href="${pageContext.request.contextPath}/student/showForm">Student form</a>
    <br><br>
    <a href="${pageContext.request.contextPath}/customer/showForm">Customer form</a>
</body>
</html>
