<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Simple Servlet</title>
</head>

<body>
<c:set var="textA" value="textA is Alex"/>
<c:set var="textB" value="textB is Benix"/>

<h1>
    Hello ${name}!
</h1>

<p>${textA}
<br>
${textB}
</p>
</body>
</html>