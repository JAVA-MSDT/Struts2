<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<h1>Login Page</h1>
	
		<s:form action="login">
		<s:textfield label="Login Id " key="userId" />
		<s:password label="Password" key="userPassword" />
		<s:submit />
	</s:form>
</body>
</html>