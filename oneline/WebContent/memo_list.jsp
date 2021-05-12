<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>memo list</title>
</head>
<body>
<%
	String url ="jdbc:mysql://localhost/db?characterEncoding=UTF-8&serverTimeZone=UTC";
	String user ="root";
	String passwd = "1234";
	Connection con = null;
	String sql = "select * from oneline";
	PreparedStatement pstmt = null;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	con = DriverManager.getConnection(url, user, passwd);
	
	pstmt = con.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery(); //select
	while(rs.next())
	{
		int no = rs.getInt(1);
		String memo = rs.getString("memo");
		String wdate = rs.getString(3);
		
		out.println("^ㅡ^ ) " + no + " : " + memo + " :(" + wdate + ")<br>");
	}
	rs.close();
	pstmt.close();
	con.close();
	System.out.println("DB 조회 성공");
%>
</body>
</html>