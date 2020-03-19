<%--
  Created by IntelliJ IDEA.
  User: binizmohamed
  Date: 3/19/20
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test </title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="container">
<form>
    <div class="form-group">
        <label for="name">User name</label>
        <input type="text" class="form-control" id="name"  placeholder="Enter username">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input type="text" class="form-control" id="email"  placeholder="Enter email">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password"  placeholder="Enter email">
    </div>
    <div class="form-group">
        <label for="checkpassword">Confirmer le Password</label>
        <input type="password" class="form-control" id="checkpassword" placeholder="etaper votre password">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</body>
</html>
