<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>

</head>
</head>
<body>
<form action="search" name="searchpage" method="POST">
		<center>
			<h2 style="color: blue">search...</h2>
			<table>
				<tr>
					<td>Start Date:<input type="text" id="datepicker" name="startDate" required /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td> 
				</tr>

			</table>
			<tr>
				<h1>
					<font color="green">${msg}</font>
					</td>
				</h1>
			</tr>
		</center>
	</form>
</body>
</html>