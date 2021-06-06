<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="/lms/web.jsp">${id }</a>/${name }/${count }/${prof }
	<a href="/lms/program.jsp">${id }</a>/${name }/${count }/${prof }
	<a href="/lms/data.jsp">${id }</a>/${name }/${count }/${prof }
	<p>
	<%@ include file = "home.jsp" %>
</body>
</html>