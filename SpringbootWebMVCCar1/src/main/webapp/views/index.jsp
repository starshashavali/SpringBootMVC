<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>BookDetails</h3>
<form action="car">
CarId:<input type="text" name="id"/>
<input type="submit" value="Search"/>
</form>
<hr/>
Id:=${car.cid}<br/>
Name:=${car.cname}<br/>
Price:=${car.price}<br/>
</body>
</html>