<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 20px;
    }
    p {
        font-size: 18px;
        color: #333;
    }
    .status {
        font-weight: bold;
        color: #008080;
        font-size: 20px;
    }
</style>
</head>
<body>
    <p>Your service is <span class="status"><%= session.getAttribute("serviceStatus") %></span></p>
</body>
</html>
