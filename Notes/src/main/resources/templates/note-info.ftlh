<!DOCTYPE html>
<html lang="ru" xmlns:th="http://www.thymeleaf.org/thymeleaf-exstras-springsecurity5">
<head>
    <meta charset="UTF-8">
    <title>О заметке</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;500;800&display=swap" rel="stylesheet">
    <link rel="stylesheet" th:href="@{/css/info.css}">
</head>
<body>
<div class="container">
    <div class="title">
        <div class="note_title">
            <a class="notes" th:href="@{/}">ЗАМЕТКИ</a>
        </div>
        <div class="btn_enter">
            <button class="enterB" type="submit">Войти</button>
        </div>
    </div>
    <div class="textTitle">Информация о заметке</div>
   <#-- <#list images as img>
    <img src="/images/${img.id}" height="60px"/><br><br>
</#list>-->
    <div class="info">
        <p class = "titleNote" th:text="${note.title}"></p>
        <p class = "bodyNote" th:text="${note.body}"></p>

        <p class = "bodyNote" th:text="${note.date}"></p>
        </div>
<div class="twobtn">
    <a class="knopki" th:href="@{/edit(id=${note.id})}">Редактировать</a>
            <a class="del" th:href="@{/delete(id=${note.id})}">Удалить</a>

        </div>
</div>
</body>
</html>