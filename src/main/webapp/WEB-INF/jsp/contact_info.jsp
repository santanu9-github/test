<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Lead|Info</h2>
<pre>
FirstName:${contact.firstName}
LastName:${contact.lastName}
Email:${contact.email}
Mobile:${contact.mobile}
LeadSource:${contact.leadSource}
Gender:${contact.gender}
</pre>
</body>
</html>