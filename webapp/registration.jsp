<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<style>
 body {
      background: linear-gradient(to bottom, #ff4081, #ff7f50);
      background-repeat: no-repeat;
      background-attachment: fixed;
      font-family: Arial, sans-serif;
      color: #fff;
    }
    
    .container {
      margin: 0 auto;
      padding-top: 30px;
    }
    
    .center-btn {
      display: flex;
      justify-content: center;
      margin-top: 20px;
    }
    hr {
      border:none;
      height: 4px;
      background-color: white;
      font-weight: bold;
    }
    a{
     text-decoration: none;
    }
  .form-control {
    height: 40px; /* Adjust the height as desired */
    font-size: 16px; /* Adjust the font size as desired */
  }
    
</style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light">
    <div class="container">
      <a class="navbar-brand" href="#" style="font-size: 25px;font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;color:white;">Training Department</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item">
            <a class="nav-link" href="index.html" style="color:white">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Registration" style="color:white">Registration</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

<div class="container">
<form action="Registration" method="post">
<center><h1 style="color:black">Registration Form</h1></center>
 <div class="mb-3 col-md-6 mx-auto">
        <label for="name" class="form-label" style="color:black">Name</label>
        <input type="text" class="form-control" placeholder="Enter your name" name="username" required>
      </div>
      <div class="mb-3 col-md-6 mx-auto">
        <label for="email" class="form-label" style="color:black">Email</label>
        <input type="email" class="form-control" placeholder="Enter your email" name="email" required>
      </div>
 <div class="mb-3 col-md-6 mx-auto">
        <label for="courses" class="form-label" style="color:black">Courses</label>
         <%
 List<String> courseList = new ArrayList<String>();
 if(request.getAttribute("cl")!=null){
  courseList = (List<String>) request.getAttribute("cl");
		
 }
 %>
  <select class="form-select" name="course">
<%
for(String each:courseList){	
%>
<option><%=each %></option>
  <%}%>
</select><br>
 <div class="mb-3 col-md-6 mx-auto">
        <label for="dob" class="form-label" style="color:black">Date of Birth</label>
        <input type="date" class="form-control" name="dofb" required>
      </div>
      <div class="center-btn">
        <button type="submit" class="btn btn-danger">Register</button>
      </div>
      </div>
</form>
 </div>
 
 <hr>
  
  <footer class="footer">
  <div class="container">
    <div class="row">
      <div class="col-md-4 text-center text-md-start">
        <p><a href="#" style="color:white">About Us</a></p>
      </div>
      <div class="col-md-4 text-center">
        <p style="color:white">Follow Us</p>
        <div class="social-icons">
          <a href="#"><i class="fab fa-facebook"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
          <a href="#"><i class="fab fa-twitter"></i></a>
        </div>
      </div>
      <div class="col-md-4 text-center text-md-end">
        <p><a href="#" style="color:white">Contact Us</a></p>
      </div>
    </div>
  </div>
</footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>