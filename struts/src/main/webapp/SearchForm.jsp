<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>

	<s:form action="tutorials/hello">
		<s:textfield key="language" placeholder="Enter a language ? " />
		<s:submit />
	</s:form>
	
</body>
</html>