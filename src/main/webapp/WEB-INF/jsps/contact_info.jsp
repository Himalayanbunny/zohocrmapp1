<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Contact Details</h2>
<form action="save" method="post">
FirstName: ${contact.firstName}<br/>
LastName: ${contact.lastName}<br/>
Email: ${contact.email}<br/>
Mobile: ${contact.mobile}<br/>
Source: ${contact.source}<br/>
<input type="submit" value="save"/>
</form>
</body>
</html>