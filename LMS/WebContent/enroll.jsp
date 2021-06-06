<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 교수 강의 등록 -->
Subject

	<form action="enroll.do" method="post">
		ID : <input type="text" name="id"/><br>
		TITLE : <input type="text" name="title"/><br>
		# of Student : <input type="text" name="studentNum"/><br>
		<input type="submit" value="enroll"> 
	</form>
</body>
</html>