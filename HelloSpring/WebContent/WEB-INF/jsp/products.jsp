<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Selected Products<BR><BR>

<%-- ${list} --%>



 <form:form action="details" commandName="ProductBean">
<form:checkboxes items="${list}" path="products" delimiter="<br/>"/>
	<BR><BR>
<td><input type="submit" value="View Details" /></td>
</form:form>
  
<%-- <form:form action="details" commandName="ProductBean" > --%>



<%-- <c:forEach items="${list}" var="i" varStatus="status" begin="0" end="1" > --%>
<%--      <form:label path="products" value="${i}"><c:out value="${i}" /></form:label><p>  --%>
<%--   </c:forEach>	 --%>
<!-- <td><input  type="submit" value="View Details" /></td> -->
<%-- </form:form> --%>
	
</body>
</html>