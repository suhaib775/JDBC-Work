<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Invalid Username and Password</h1>

<form action="/car-service-project/CustomerLogin">
<table>
<tr><td>Username</td>
<td><input type="text" name="username" required/></td></tr>
<tr><td>Password</td>
<td><input type="password" name="password" required/></td></tr>
<tr><td><input type="submit" value="Login"/></td></tr>
</table>
</form>
</body>
</html>