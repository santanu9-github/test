<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create|Lead</title>
</head>
<body>
	<h2>Create|Lead</h2>
	<form action="savelead"method="post">
		<pre>
FirstName<input type="text" name="firstName" />
LastName<input type="text" name="lastName" />
Email<input type="text" name="email" />
Mobile<input type="text" name="mobile" />
LeadSource:<select name="leadSource">
  <option value="radio">Radio</option>
  <option value="tv">TV</option>
  <option value="news paper">News Paper</option>
  <option value="trade show">Tread Show</option>
</select>
Gender:
Male<input type="radio" name="gender" value="male">
Female<input type="radio" name="gender" value="female">
<input type="submit" value="save" />
</pre>
	</form>
</body>
</html>