<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User Name should be unique</h1>
<form action="/car-service-project/CustomerRegister">
<table>
<tr>
<td>Name</td>
<td><input type="text" name="name" required/></td>
</tr><tr>
<td>User Name</td>
<td><input type="text" name="username" required/></td>
</tr><tr>
<td>Password</td>
<td><input type="password" name="password" required/></td>
</tr><tr>
<td>Confirm Password</td>
<td><input type="password" name="conpassword" required/></td>
</tr><tr>
<td>Email</td>
<td><input type="email" name="email" required/></td>
</tr><tr>
<td><input type="submit" value="Register" required/></td>
</tr>
</table>
</form>
</body>
</html>
</body>
</html>