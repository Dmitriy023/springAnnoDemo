<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 30/05/2019
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>

<body>
    <form:form action="/customer/save" modelAttribute="customer">
       First Name: <form:input path="firstName"/>
        <br/><br/>
       Last Name: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br/><br/>
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>
