<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="list" items="${getlist}">
				<%-- <div  style="border-bottom: solid; border-bottom-color: orange;" >
				<p style="color: green">ID:<c:out value="${list.getId()}" /></p>
				<p style="color: green">Name:<c:out value="${list.getName()}" /></p>
				<p style="color: green">Date:<c:out value="${list.getStartDate()}" /></p>
				</div> --%>
				  <tr>
				 	<td><c:out value="${list.getId()}" /></td>
					<td><c:out value="${list.getName()}" /></td>
					<td><c:out value="${list.getStartDate()}" /></td>					
				</tr> 
				
			</c:forEach>
</body>
</html>