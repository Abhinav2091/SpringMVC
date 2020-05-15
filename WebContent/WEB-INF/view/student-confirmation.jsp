<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- JSTl tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Form</title>
</head>
<body>

<h2>OK so we are in confirmation Page</h2><br><br>

Name:${student.name} <br><br>
Age:${student.age} <br><br>
Country:${student.country} <br><br>
Fav Language:${student.favouriteLanguage} <br><br>

Operating System
<ul>
<c:forEach var="temp" items="${student.operatingSystem}">
<li>
${temp}
</li>
</c:forEach>
</ul>
</body>
</html>