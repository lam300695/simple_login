<%--
  Created by IntelliJ IDEA.
  User: lam
  Date: 27/02/2020
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
    <link rel="stylesheet" href="Style.css">
  </head>
  <body>
  <form method="get" action="/login">
    <div class="login">
      <h1>Login</h1>
      <input type="text" name="usename" placeholder="Nhap tai khoan" required>
      <input type="password" name="password" placeholder="Nhap mat khau" required>
      <input type="submit" value="Login">
    </div>
  </form>
  </body>
</html>
