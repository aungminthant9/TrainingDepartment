<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.db.*" %>
     <%@ page import="com.model.*" %>
     <%@ page import="com.controller.*" %>
      <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
			border-collapse: collapse;
			width: 100%;
			margin-bottom: 20px;
			background-color: #f3f3f3;
			border: 1px solid #ccc;
			font-size: 18px;
		}
 th, td {
			text-align: left;
			padding: 8px;
			border-bottom: 1px solid #ccc;
		}
 th {
			background-color: #007bff;
			color: white;
		}

 td {
			background-color: #f9f9f9;
			color: #555;
		}
 h2{
          text-align: center;
          color: #555
 }
 a{
		background-color: #f9f9f9;
		color: #555;
		transition: font-size 0.2s ease-in-out;
		text-decoration: none;
		}

 a:hover,a:active {
		font-size: 20px;
		color: red;
		}
</style>
</head>
<body>
  <h2>Keepers Data</h2>
<table>
<tr>
<th>Course ID</th>
<th>User Name</th>
<th>Email</th>
<th>Selected Course</th>
<th>Date of Birth</th>
<th>Edit</th>
<th>Delete</th>

</tr>
<%
CourseCRUD ccrud = new CourseCRUD();
ArrayList<Register> courseList = ccrud.selectall();
for(Register data: courseList){
%>
<tr>
<td><%= data.getId() %></td>
<td><%= data.getName() %></td>
<td><%= data.getEmail() %></td>
<td><%= data.getSelected_course() %></td>
<td><%= data.getDateofBirth() %></td>
<td><a href="updateCourse.jsp?id=<%= data.getId()%>
&username=<%= data.getName()%>
&email=<%= data.getEmail()%>
&selected_course=<%= data.getSelected_course() %>
&dob=<%= data.getDateofBirth()%>">Edit</a></td>
<td><a href="deleteCourse.jsp?id=<%= data.getId()%>">Delete</a></td>

<%}
%>
</table>
</body>
</html>