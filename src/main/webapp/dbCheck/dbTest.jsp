<%@page import="dbConnect.dbConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	dbConnection db = new dbConnection();
	String result = db.dbSelect();


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%= result %></p>
</body>
</html>