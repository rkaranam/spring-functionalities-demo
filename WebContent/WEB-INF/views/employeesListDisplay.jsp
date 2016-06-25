<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
	<title>Spring MVC Internationalization</title>
</head>
<body>
	<h2><spring:message code="lbl.page" text="All Employees in System" /></h2>
	
	<table border="1">
		<tr>
			<th><spring:message code="lbl.Id" text="Employee Id" /></th>
			<th><spring:message code="lbl.firstName" text="First Name"/></th>
			<th><spring:message code="lbl.lastName" text="Last Name"/></th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>