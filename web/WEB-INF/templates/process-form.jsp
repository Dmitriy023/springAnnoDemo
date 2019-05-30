<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 27/05/2019
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Processing Form Page</title>
</head>
<h1>Processing Form page</h1>
    <br/>
    <h1> First Name:  ${student.firstName} </h1>
    <h1> Last Name:  ${student.lastName} </h1>
    <h1> Country:  ${student.country} </h1>
    <h1> language:  ${student.favouriteLanguage} </h1>

<ul>
    <c:forEach var="op" items="${student.operatingSystems}">
        <li>${op}</li>
    </c:forEach>
</ul>
<a href="/">Back to index page</a>
<br/>
<a href="/show">Back to Form page</a>
</body>
</html>
