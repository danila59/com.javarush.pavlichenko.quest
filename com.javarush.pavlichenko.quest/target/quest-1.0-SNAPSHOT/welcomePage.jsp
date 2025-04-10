<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Квест: Последний шанс</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS.css">
</head>
<body>
<!-- Фоновая картинка -->
<img class="fullscreen-bg"
     src="${pageContext.request.contextPath}/img/317edba860b7ca28f3fc5527a3c60d66.jpeg"
     alt="Фоновое изображение">

<!-- Основное содержимое -->
<div class="content-wrapper">
    <div class="overlay-text">
        <h1 class="text-center">Квест: Последний шанс.</h1>

        <pre><%= "Ты просыпаешься от резкого взрыва где-то близко — стекла в окнах дребезжат, а воздух густой от дыма и чего-то еще... паленого мяса?\n" +
                "\n" +
                "Сирены воют неровно, будто кто-то давит на кнопку в панике. Где-то вдалеке автоматная очередь, потом крик, который обрывается слишком резко.\n" +
                "\n" +
                "За окном — апокалипсис в реальном времени.\n" +
                "\n" +
                "Улица, еще вчера такая знакомя, теперь погружена в хаос:\n" +
                "\n" +
                "Бегущие люди с пустыми, безумными глазами, волочащие чемоданы с пробитым днищем.\n" +
                "\n" +
                "Тени, которые движутся слишком медленно... и слишком целенаправленно. Одна из них наклоняется над упавшей женщиной — раздается влажный хруст.\n" +
                "\n" +
                "Горящая заправка в конце квартала. Оранжевое пламя лижет грязное небо, и черные хлопья пепла падают на подоконник, как снег.\n" %></pre>
    </div>

    <div class="registration-container">
        <h2 class="text-center">Введите имя игрока</h2>

        <form action="RegisterPlayer" method="post">
            <div class="form-group">
                <label for="playerName">Имя игрока:</label>
                <input type="text" class="form-control" id="playerName" name="playerName"
                       value="${param.playerName}"
                       placeholder="Введите ваше имя"
                       required minlength="3" maxlength="20">
            </div>
            <br/>
            <div class="text-center">
                <button type="submit" class="btn btn-primary bubbly-button">Начать игру</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>