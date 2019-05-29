<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 29/05/2019
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student-Form</title>
</head>
<body>
    <form:form action="/student/save" modelAttribute="student">
         First Name:   <form:input path="firstName"/>
        <br/><br/>
        Last Name : <form:input path="lastName"/>

        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
