<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>

<!-- External CSS for styling -->
<style>
    /* Body styling */
    body {
        background-color: #f0f8ff; /* Light blue background */
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        margin: 0;
        padding: 0;
    }

    /* Styling for the h1 element */
    h1 {
        font-size: 48px;
        color: #4CAF50; /* Green color */
        text-shadow: 3px 3px 5px rgba(0, 0, 0, 0.2); /* Text shadow effect */
        background: linear-gradient(90deg, #4CAF50, #81C784);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        animation: glow 1.5s infinite alternate; /* Glowing effect */
    }

    /* Glowing animation */
    @keyframes glow {
        0% {
            text-shadow: 0 0 10px #4CAF50, 0 0 20px #4CAF50, 0 0 30px #81C784;
        }
        100% {
            text-shadow: 0 0 20px #81C784, 0 0 40px #81C784, 0 0 60px #4CAF50;
        }
    }
</style>

</head>
<body>
    <h1>Login Success</h1>
</body>
</html>
