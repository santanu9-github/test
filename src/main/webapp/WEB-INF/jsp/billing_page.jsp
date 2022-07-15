<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create|Billing</title>
</head>
<body>
	<h2>Create|Billing</h2>
	<form action="savebill"method="post">
		<pre>
FirstName<input type="text" name="firstName" value="${contact.firstName}"/>
LastName<input type="text" name="lastName" value="${contact.lastName}"/>
Email<input type="text" name="email" value="${contact.email}"/>
Mobile<input type="text" name="mobile" value="${contact.mobile}"/>
ProductName<input type="text" name="productName"/>
Amount<input type="text" name="amount"/>
<input type="submit" value="bill" />
</pre>
	</form>
${save}
</body>
</html>