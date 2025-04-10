<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>


<div style="
    position: fixed;
    bottom: 10px;
    left: 10px;
    background-color: rgba(255, 255, 255, 0.8);
    padding: 10px;
    border-radius: 5px;
    font-family: Arial, sans-serif;
    font-size: 14px;
    z-index: 1000;
    border: 1px solid black;
">
    <c:if test="${not empty pageContext.session}">
        Session ID: ${pageContext.session.id}<br>
        Имя игрока: <c:out value="${sessionScope.UserName}"/><br>
        Количество сыгранных игр: <c:out value="${sessionScope.CountGame}"/><br>
    </c:if>
</div>
</body>
</html>