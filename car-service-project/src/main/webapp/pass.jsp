<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .welcome-message {
        background-color: white;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    h1 {
        color: #333;
        font-size: 2em;
        margin-bottom: 20px;
    }

    p {
        color: #555;
        font-size: 1.2em;
    }

    .nav-links {
        margin-top: 20px;
        display: flex;
        flex-direction: column;
        gap: 10px;
    }

    .nav-links a {
        text-decoration: none;
        color: white;
        background-color: #007bff;
        padding: 10px 20px;
        border-radius: 5px;
        transition: background-color 0.3s ease;
        text-align: center;
        font-size: 1em;
    }

    .nav-links a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<div class="welcome-message">
    <h1>Welcome</h1>
    <p><% out.println("You logged as " + session.getAttribute("sname")); %></p>
    <div class="nav-links">
        <a href="AddCarDetails.html">Enter Car Details</a>
        <a href="">Edit Car Details</a>
        <a href="ServiceRequest.html">Request Service</a>
        <a href="ServiceStatus.html">Request Status</a>
    </div>
</div>

</body>
</html>
