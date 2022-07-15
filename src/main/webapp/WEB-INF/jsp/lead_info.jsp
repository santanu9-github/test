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
FirstName:${lead.firstName}
LastName:${lead.lastName}
Email:${lead.email}
Mobile:${lead.mobile}
LeadSource:${lead.leadSource}
Gender:${lead.gender}
</pre>
<form action="convertlead"method="post">
<input type="hidden"name="id"value="${lead.id}"/>
<input type="submit"value="convert"/>
</form>
</body>
</html>