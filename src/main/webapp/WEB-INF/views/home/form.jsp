<%--
  Created by IntelliJ IDEA.
  User: binizmohamed
  Date: 3/19/20
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<style>
    .error{
        color :red;
    }
</style>
<body>
<div class="container">
    <form:form modelAttribute="phoneform" action="traitement" method="post">
        <div class="form-group">
            <label for="name">telephone</label>
            <form:input cssClass="form-control"  id="name" path="tel"  placeholder="Enter votre telephone" />
            <form:errors path="tel" cssClass="alert alert-danger" />
        </div>
        <div class="form-group">
            <label for="code">code</label>
            <form:input cssClass="form-control"  id="name" path="code"  placeholder="Enter votre code" />
            <form:errors path="code" cssClass="alert alert-danger" />
        </div>
        <div class="form-group">
            <label for="code">date de naissance</label>
            <form:input cssClass="form-control"   id="code" path="naissance"  placeholder="Enter votre date de naissance" />
            <form:errors path="naissance" cssClass="alert alert-danger" />
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>

    </form:form>
</div>
</body>
</html>
