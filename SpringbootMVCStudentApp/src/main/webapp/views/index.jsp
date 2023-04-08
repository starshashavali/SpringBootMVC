<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Info</h1>
	<p>
		<font color="green">${msg }</font>
	</p>
	<form:form action="save" modelAttribute="student" method="Post">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			
			<tr><td>Gender:</td>
			<td><form:radiobutton path="gender" value="M"/>Male</td>
						<td><form:radiobutton path="gender" value="F"/>Female</td>
			
			</tr>
			
			

			<tr>
				<td>Course</td>
				<td><form:select path="course">
						<form:option value="">-Select-</form:option>
					<!-- it will iterate courses one by one -->
					<form:options items="${courses}"/>
					</form:select></td>
				</br>
			<tr>
				<td>Timings</td>
			<td>
			<form:checkboxes items="${prefTimings}" path="timings"/>
			</td>
			</tr>


			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>