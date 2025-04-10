<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/session.jsp" %>
<!DOCTYPE html>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS.css">
</head>

<body>
<div class="main-content">
    <img class="fullscreen-bg"
         src="${pageContext.request.contextPath}/img/317edba860b7ca28f3fc5527a3c60d66.jpeg"
         alt="Фоновое изображение">

    <h3 class="result-description"><c:out value="${currentOption.resultDescription}"/></h3>
    <br/>
    <div class="form-container">
        <form action="restart" method="POST">
            <button type="submit" class="btn btn-primary mt-3">Начать заново</button>
        </form>
    </div>
    <br/>
</div>
</body>
</html>
