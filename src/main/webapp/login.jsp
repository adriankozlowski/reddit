<%--
  Created by IntelliJ IDEA.
  User: Robert Mitko
  Date: 2018-09-05
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Reddit - logowanie</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="/resources/css/styles.css" type="text/css" rel="stylesheet">
</head>

<body>

<nav class = "navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <a href="#" class="navbar-brand">Reddit</a>

        <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
            <span class="glyphicon glyphicon-list"></span>
        </button>

        <div class="collapse navbar-collapse navHeaderCollapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="index.jsp">Główna</a></li>
                <li><a href="#">Dodaj</a></li>
                <li><a href="login.jsp">Zaloguj się</a></li>
            </ul>
        </div>

    </div>
</nav>

<div class="container">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
        <form class="form-signin" action="j_security_check" method="post">
            <h2 class="form-signin-heading">Zaloguj się</h2>
            <input name="j_username" type="text" class="form-control" placeholder="Nazwa uzytkownika" required autofocus>
            <input name="j_password" type="password" class="form-control" placeholder="Hasło" required>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Zaloguj</button>
            <a href="register.jsp">Zarejestruj</a>
        </form>
    </div>
</div>

<footer class="footer">
    <div class="container">
        <p class="navbar-text">Reddit - developed by <a href="https://www.linkedin.com/in/robert-mitko-b57631155/">Robert Mitko</a></p>
    </div>
</footer>

<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="resources/js/bootstrap.js"></script>
</body>
</html>
