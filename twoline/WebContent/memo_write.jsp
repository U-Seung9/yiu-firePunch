<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.sql.*" %>
<%@ page import="twoline.OnelineDTO" %>
<%@ page import="twoline.OnelineDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
	String memo = request.getParameter("memo");
	OnelineDTO dto = new OnelineDTO();
	OnelineDAO dao = new OnelineDAO();
	dto.setMemo(memo);
	
	dao.insert(dto);
%>
response.sendRedirect("memo_list.jsp");
<%-- <body>
<%
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
</body> --%>

</html>