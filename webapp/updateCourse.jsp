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
</head>
<body>
  <%
int id = Integer.valueOf(request.getParameter("id"));
String userName = request.getParameter("username");
String email = request.getParameter("email");
String course =request.getParameter("selected_course");
String dofb = request.getParameter("dob");
%>
<form action="updateactionCourse.jsp">
 <div class="card">
 <h2>Update the Course Registration</h2>
 <input type="hidden" name=id value=<%=id %>>
  <label>User Name</label>
  <input type="text" name="username" value=<%= userName %>><br>
  <label>Email</label>
  <input type="email" name="email" value=<%= email %>><br>
   <label>Course</label>
  <input type="text"  name="selected_course" value="<%= course %>"><br>
  <label>Date of Birth</label>
  <input type="date" name="dob" value=<%= dofb %>><br>
  <button type="submit">Update</button>
  </div>
 </form>
</body>
</html>