<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%
	// /ddit/01/gugudanResult.jsp?dan=5
	String dan = request.getParameter("dan");
%>
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i = 1; i < 10; i++) {
	%>
			<%=dan %> * <%=i %> = <%=Integer.parseInt(dan) * i %><br/>
	<%
		}
	%>
</body>
</html>