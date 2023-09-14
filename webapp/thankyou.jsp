<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
  <title>Insert title here</title>
  <style>
    body {
      background: linear-gradient(to bottom, #5f72be, #8256b5);
      background-repeat: no-repeat;
      background-attachment: fixed;
      font-family: Arial, sans-serif;
    }
    
    .containers {
      max-width: 400px;
      margin: 0 auto;
      padding: 50px;
      color: #fff;
      text-align: center;
      background-color: rgba(255, 255, 255, 0.2); /* Transparent background */
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3); /* Box shadow */
      border-radius: 15px;
    }
    
    h1 {
      font-size: 2.5em;
      margin-bottom: 1em;
    }
    
    p {
      font-size: 1.2em;
      margin-bottom: 1.5em;
    }
    
    .center-btn {
      display: flex;
      justify-content: center;
    }
     hr {
      border:none;
      height: 4px;
      background-color: white;
      font-weight: bold;
    }
    a{
     text-decoration: none;
     color:white;
    }
  </style>
</head>
<body>
  <div class="container containers">
    <h1>Thank You!</h1>
    <p>Your registration was successful.</p>
    <p>We look forward to having you as a participant.</p>
    <p>We've sent you an email about this course to make sure if this is the course that you chose.</p>
    <%
      String message = (String)request.getAttribute("message");
      String name = request.getParameter("username");
      String email = request.getParameter("email");
      String course = request.getParameter("course");
    %>
    <div class="row">
      <div class="col">
        <p>Your Name:<br> <b style="color:black"><%= name %></b></p>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <p>Your Selected Course:<br><b style="color:black"><%= course %></b></p>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <p>Your Email:<br><b style="color:black"><%= email %></b></p>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <div class="center-btn">
          <a href="index.html" class="btn btn-primary">Go Back to Home Page</a>
        </div>
      </div>
    </div>
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

</body>
</html>
