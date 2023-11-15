<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>User Details</h1>
 <%= "ID "+request.getParameter("id") %><br>
 <%= "Name "+request.getParameter("name") %><br>
 <%= "Phone Number "+request.getParameter("phno") %><br>
 <%= "Address "+request.getParameter("address") %><br></center>



</body>
</html>