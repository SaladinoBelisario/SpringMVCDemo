<%--
  Created by IntelliJ IDEA.
  User: Luis
  Date: 10/04/2021
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" />
        <br><br>
        Last Name: <form:input path="lastName" />
        <br><br>
        Country:
            <form:select path="country">
                <form:options items="${student.countryOptions}" />
            </form:select>
        <br><br>
        Favorite Language:
            <form:radiobutton path="favoriteLanguage" label="Java" />
            <form:radiobutton path="favoriteLanguage" label="C#" />
            <form:radiobutton path="favoriteLanguage" label="Ruby" />
            <form:radiobutton path="favoriteLanguage" label="C++" />
        <br><br>
        Operating systems:
        Linux: <form:checkbox path="operatingSystems" value="Linux" />
        Windows: <form:checkbox path="operatingSystems" value="Windows" />
        MacOS: <form:checkbox path="operatingSystems" value="MacOs" />
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
