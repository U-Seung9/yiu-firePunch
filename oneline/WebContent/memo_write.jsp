<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memo write</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String memo = request.getParameter("memo");
	String url ="jdbc:mysql://localhost/db?characterEncoding=UTF-8&serverTimeZone=UTC";
	String user ="root";
	String passwd = "1234";
	Connection con = null;
	
	String sql = "insert into oneline(memo) values(?)";
	PreparedStatement pstmt = null;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection(url, user, passwd);
	
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, memo);
	pstmt.executeUpdate(); 
	pstmt.close();
	con.close();
	System.out.println("데이터 추가 성공");
%>
</body>
</html>