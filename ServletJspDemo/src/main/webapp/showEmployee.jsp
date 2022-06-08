<%@page import="com.vipul.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
	<%
		Employee e = (Employee)request.getAttribute("Employee");
		
		out.println(e);
	%>
</body>
</html>