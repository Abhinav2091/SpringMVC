<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">
		  
		  <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
<meta charset="ISO-8859-1">
<title>Spring MVC demo home page</title>
</head>
<body>
<a href ="show-form">Spring MVC Welcome page</a>
<br><br>
<%-- <img src="${pageContext.request.contextPath}/resources/images/spring-demo.PNG" /> --%>
<a href ="student/show-form">Click to Go to Student Form for data binding examples</a>

<br><br>
<%-- <img src="${pageContext.request.contextPath}/resources/images/spring-demo.PNG" /> --%>
<a href ="customer/show-form">Click to Go to Customer Form for validation examples</a>
<br><br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>
</body>
</html>