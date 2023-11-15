<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div text-align: center;>
	<% 
	String s=request.getParameter("uname");
	int len=s.length();
	boolean flag=false;
	if(len>5){
		for(int i=0;i<len;i++){
			if(Character.isAlphabetic(s.charAt(i))){
				flag=true;
			}
			else{
				flag=false;
			}
		}
	}
	else{
		out.print("Length Should minimun five characters");
	}
	if(flag){
		out.print("Valid");
	}else{
		out.print("Invalid");
	}
	
	
		
	
	
	
	%>
	</div>

</body>
</html>