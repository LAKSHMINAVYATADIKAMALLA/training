<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="examples.Details"></jsp:useBean>
<jsp:setProperty property="username" name="u"/>
<jsp:setProperty property="password" name="u"/>
<jsp:setProperty property="age" name="u"/>

 You have entered below details:<br>
 <jsp:getProperty property="username" name="u"/><br>
 <jsp:getProperty property="password" name="u"/><br>
 <jsp:getProperty property="age" name="u"/><br>
</body>
</html>