<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
Yongin LMS

<%String cookie = "";
		Cookie[] cookies = request.getCookies();
		if(cookies !=null&& cookies.length > 0)
		for (int i = 0; i < cookies.length; i++){
			if (cookies[i].getName().equals("userId")) { 
				cookie = cookies[i].getValue();}}%>
				
<p>
	<form action="login.do" method="post">
	<% String Student="", Professor=""; %>
		ID : <input type="text" name="id"/><br>
		PWD : <input type="password" name="pwd"/><br>
		<input type="radio" name="level" value="<%= Professor %>" onclick="change_action('P')"/>Professor
		<input type="radio" name="level" value="<%= Student %>" onclick="change_action('S')"/>Student
		<br>
		<input type="submit" value="LogIn"> 
	</form>

</body>
</html>