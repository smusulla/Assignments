<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<center>
			<h1>User Details</h1></center>
		
		<center><form action="Result.jsp" method="">


				<label for="id"><b>id : </b></label>
				 <input type="text"
					placeholder="Enter Id" name="id" required><br> <label
					for="name"><b>Name : </b></label> 
					<input type="text"
					placeholder="Enter Name" name="name" required><br> <label
					for="phno"><b>PhoneNumber : </b></label>
					 <input type="number"
					placeholder="Enter Phone number" name="phno" required><br>
				<input type="address"
					placeholder="Enter Address" name="address" required><br>

				
				<button type="submit">Submit</button>
				</label>
			
		</form>
	</center>
</body>
</html>