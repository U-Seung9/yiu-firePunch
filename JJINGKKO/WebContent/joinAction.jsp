<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="uId" />
<jsp:setProperty name="user" property="uPwd" />
<jsp:setProperty name="user" property="uName" />
<jsp:setProperty name="user" property="uGender" />
<jsp:setProperty name="user" property="uEmail" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN</title>
</head>
<body>
	<%
		if (user.getuId() == null || user.getuPwd() == null || user.getuName() == null
		|| user.getuGender() == null || user.getuEmail() == null)
		{
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("모든 사항에 입력 하십쇼!");
			script.println("history.back()");
			script.println("</script>");
		} else {
			UserDAO userDAO = new UserDAO();
			int result = userDAO.join(user);
			if(result == -1) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미 존재하는 아이디입니다!')");
				script.println("history.back()");
				script.println("</script>");
			}
			else {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('회원가입 성공!')");
				script.println("location.href = 'login.jsp'");
				script.println("</script>");
			}
		}
	
	%>

</body>
</html>