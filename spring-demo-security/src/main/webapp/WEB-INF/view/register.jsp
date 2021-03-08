<%--
  Created by IntelliJ IDEA.
  User: lborbely
  Date: 08.03.21
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<h1>
    Register Page
</h1>
<c:url value="/register" var="loginVar"/>
<form id="registerForm" action="${loginVar}" method="POST">
    <div class="form-group">
        <label for="userName">Username</label>
        <input id="userName" name="userName" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" type="password" class="form-control"/>
    </div>
    <sec:csrfInput/>
    <input type="submit"/>
</form>
</body>
</html>
