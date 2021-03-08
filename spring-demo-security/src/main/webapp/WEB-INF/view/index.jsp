<%--
  Created by IntelliJ IDEA.
  User: lborbely
  Date: 08.03.21
  Time: 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index Page</title>
</head>
<body>
<h1>Index Page</h1>
<div><a href="<c:url value="/register"/>">Register</a></div>
<div><a href="<c:url value="/secret"/>">Secret</a></div>
<div><a href="<c:url value="/top-secret"/>">Top-Secret</a></div>
</body>
</html>
