<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "content-Type" contentType="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String productName = request.getParameter("product");
	
	ArrayList<String> list = (ArrayList<String>) session.getAttribute("productList");
	if (list == null) {
		list = new ArrayList<String>();
		session.setAttribute("productList", list);
	}
	
	list.add(productName);
%>
<script>
	alert("<%= productName %> 장바구니에 추가 완료!");
	history.go(-1);
</script>
</body>
</html>