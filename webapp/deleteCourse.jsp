<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.db.*" %>
     <%@ page import="com.model.*" %>
      <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.card{
 background-color: #ffffff;
 width: 400px;
 padding: 20px;
 margin: 50px auto;
 border-radius: 10px;
 box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}
h1{
 color: #555;
}
</style>
</head>
<body>
 <%
int id = Integer.valueOf(request.getParameter("id"));
CourseCRUD ccrud = new CourseCRUD();
ccrud.delete(id);
%>
<div class="card"><h1>Id <%=id %> is deleted Successfully</h1>
<span><a href="courseList.jsp">Click here</a> to see all the data.</span>
</div>
</body>
</html>