<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/session.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS.css">
</head>

<body>
<img class="fullscreen-bg"
     src="${pageContext.request.contextPath}/img/317edba860b7ca28f3fc5527a3c60d66.jpeg"
     alt="Фоновое изображение">

<div class="main-content">
    <h3 class="result-description"><c:out value="${currentOption.resultDescription}"/></h3>

    <div class="form-container">
    <div class="radio-buttons-container" >
        <form action="mainServlet" method="GET">
            <!-- Вложенные кнопки -->
            <c:if test="${not empty currentOption.avalibleRadioButtons}">
                <c:forEach var="btn" items="${currentOption.avalibleRadioButtons}">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="selectedOption"
                               id="option${btn.code}" value="${btn.code}">
                        <label class="form-check-label" for="option${btn.code}">
                                ${btn.name}
                        </label>
                    </div>
                </c:forEach>
            </c:if>
            <button type="submit" class="btn btn-primary mt-3">Ответить</button>
        </form>
    </div>
</div>
</div>
</body>
</html>