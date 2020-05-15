<!--tag for binding-->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form tag of Spring</title>

</head>
<body>
<form:form action="process-form" modelAttribute="student">
Name : <form:input path="name"/>
<br><br>
Age : <form:input path="age"/>
<br><br>
<!-- Country  : from HTML FORM : -->
<!-- either read from html form or from java class or from propert files--> 

<%-- <form:select path="country"> --%>
<%-- <form:option value="INDIA" label="INDIA"/> --%>
<%-- <form:option value="USA" label="USA"/> --%>
<%-- <form:option value="GERMANY" label="GERMANY"/> --%>
<%-- <form:option value="BRAZIL" label="BRAZIL"/> --%>
<%-- </form:select><br><br> --%>

<!-- Country  : from JAVA : -->
<%-- <form:select path="country">  --%>
<%-- <form:options items="${student.countryOptions}"/> --%>
<%-- </form:select> --%>
<!-- <br><br> -->

Country  : from Property File :
<form:select path="country"> 
 <form:options items="${PcountryOption}" />
</form:select>
<br><br>

<!-- Favorite Language : from HTML Form : -->
<%-- Java<form:radiobutton path="favouriteLanguage" value="Java"/> --%>
<%-- C#<form:radiobutton path="favouriteLanguage" value="C#"/> --%>
<%-- PHP<form:radiobutton path="favouriteLanguage" value="PHP"/> --%>
<%-- Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/> --%>
<br><br>
Favorite Language : from JAVA :
<form:radiobuttons path="favouriteLanguage"
 items="${student.favouriteLanguagefromJava}"/>
<br><br>
Check boxes : From HTML TAG :
OperatingSystem : 
Linux<form:checkbox path="operatingSystem" value="Linux"/>
Window<form:checkbox path="operatingSystem" value="Window"/>
MAC<form:checkbox path="operatingSystem" value="Mac"/>
<br><br>
<input type="submit" value="Submit" />
</form:form>

</body>
</html>