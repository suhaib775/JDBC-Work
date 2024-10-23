<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Car Details</title>
<style>
    body {
        background-color: #e0f7fa;
        font-family: 'Arial', sans-serif;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column; /* Aligns content in a column */
        justify-content: center; /* Centers content vertically */
        align-items: center; /* Centers content horizontally */
        height: 100vh;
    }
    h1 {
        color: #00796b;
        font-size: 36px;
        font-weight: bold;
        text-shadow: 2px 2px 4px #000000;
        margin-bottom: 20px; /* Adds space between the heading and the link */
    }
    a {
        display: inline-block;
        padding: 15px 30px;
        background-color: #00796b;
        color: white;
        text-decoration: none;
        font-size: 20px;
        font-weight: bold;
        border-radius: 8px;
        box-shadow: 2px 2px 8px rgba(0, 0, 0, 0.2);
        transition: background-color 0.3s ease, box-shadow 0.3s ease;
    }
    a:hover {
        background-color: #004d40;
        box-shadow: 4px 4px 12px rgba(0, 0, 0, 0.4);
    }
</style>
</head>
<body>
    <h1>View Car Details</h1>
    <a href="/car-service-project/ViewCars">Hey Sebu View Car Details</a>
</body>
</html>
