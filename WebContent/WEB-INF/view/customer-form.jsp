<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="process-form" modelAttribute="customer">
First Name :<form:input path="fName"/>
<form:errors path="fName" cssClass="error"></form:errors><br>
Last Name(*) :<form:input path="lName"/>
<form:errors path="lName" cssClass="error"></form:errors><br>
free passes :<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"></form:errors><br><br>
postal Code :<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"></form:errors><br><br>
Course Code :<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"></form:errors><br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>