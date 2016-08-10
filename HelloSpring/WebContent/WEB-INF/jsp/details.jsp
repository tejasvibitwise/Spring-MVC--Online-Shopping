<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--  ${list}  --%>

Please select the items which you want to purchase :
<form:form action="delete" commandName="ProductBean">
<form:checkboxes items="${list}" path="products" delimiter="<br/>"/>
	<BR><BR>
<td><input type="submit" value="Buy" /></td>
</form:form>

</body>
</html>