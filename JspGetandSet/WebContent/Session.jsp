<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("username");
String password=request.getParameter("password");
String age=request.getParameter("age");
out.print("welcome"+uname);
out.print("welcome"+password);
out.print("welcome"+age);
session.setAttribute("sname",uname);
session.setAttribute("spassword",password);
session.setAttribute("sage",age);


%>
<a href="Output.jsp">Check Output Page Here</a>
</body>
</html>