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
                    <form:errors path="lastName" cssClass="error"/>



        <%--<form:select path="country">--%>
            <%--<form:option value="AZ" label="Azerbaijan"/>--%>
            <%--<form:option value="RU" label="RUSSIA"/>--%>
            <%--<form:option value="US" label="USA"/>--%>

        <%--</form:select>--%>
        <br/><br/>
        <form:radiobutton path="favouriteLanguage" value="JAVA" label="JAVA"/>
        <form:radiobutton path="favouriteLanguage" value="PHP" label="PHP"/>
        <form:radiobutton path="favouriteLanguage" value="Ruby" label="RUBY"/>
        <br/><br/>

        <form:select path="country">
            <form:options items="${student.countries}"/>
        </form:select>
        <br/><br/>

        <form:checkbox path="operatingSystems" value="Linux" label="Linux"/>
        <form:checkbox path="operatingSystems" value="Windows" label="Windows"/>
        <form:checkbox path="operatingSystems" value="Mac" label="Mac"/>
        <br/><br/>
        <input type="submit" value="Submit"/>

    </form:form>


</body>

</html>
