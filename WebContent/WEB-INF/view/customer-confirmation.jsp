<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
The Customer Details : ${customer.fName} ${customer.lName} 
<br><br>
${customer.freePasses}<br>
${customer.postalCode} <br>
${customer.courseCode} 
</body>
</html>