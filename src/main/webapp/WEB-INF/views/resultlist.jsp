<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
<style type="text/css">
.asd {
	color: lime;
	border: solid;
	border-color: orange;
	overflow: scroll;
	max-width: 400px;
	max-height: 100px;
	margin: auto;
}
</style>
</head>
<body>
	<h1 align="center" style="color: blue;">List......</h1>
	<div class="asd">
		<!-- <table border="10" bordercolor="blue">-->
		<table>
			<tr>
				<th width="5%">Id</th>
				<th width="5%">Name</th>
				<th width="5%">Date</th>
			</tr>
			<jsp:include page="lists.jsp"></jsp:include>
		</table>
		
	</div>
</body>
</html>