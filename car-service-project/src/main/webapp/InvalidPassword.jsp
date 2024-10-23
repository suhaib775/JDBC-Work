<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Login</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #2c3e50;
      color: #ecf0f1;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    form {
      background-color: #34495e;
      padding: 40px;
      border-radius: 12px;
      box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
      width: 100%;
      max-width: 380px;
      transition: box-shadow 0.3s ease;
    }

    form:hover {
      box-shadow: 0 12px 24px rgba(0, 0, 0, 0.4);
    }

    table {
      width: 100%;
    }

    td {
      padding: 12px 0;
    }

    label {
      display: block;
      margin-bottom: 5px;
      font-size: 14px;
      color: #bdc3c7;
    }

    input[type="text"] {
      width: 100%;
      padding: 12px;
      border: none;
      border-radius: 6px;
      background-color: #ecf0f1;
      color: #2c3e50;
      font-size: 16px;
      margin-top: 6px;
      transition: background-color 0.2s ease, box-shadow 0.2s ease;
    }

    input[type="text"]:focus {
      background-color: #ffffff;
      box-shadow: 0 0 8px rgba(0, 0, 0, 0.2);
      outline: none;
    }

    input[type="submit"] {
      width: 100%;
      padding: 14px;
      background-color: #e74c3c;
      color: #ecf0f1;
      border: none;
      border-radius: 6px;
      font-size: 18px;
      cursor: pointer;
      margin-top: 20px;
      transition: background-color 0.3s ease, transform 0.3s ease;
    }

    input[type="submit"]:hover {
      background-color: #c0392b;
      transform: scale(1.02);
    }

    h2 {
      text-align: center;
      margin-bottom: 24px;
      font-size: 26px;
      color: #ecf0f1;
    }

    @media (max-width: 600px) {
      form {
        padding: 20px;
      }

      input[type="submit"], input[type="text"] {
        font-size: 14px;
      }
    }
  </style>
</head>
<body>
  <form action="/car-service-project/AdminLogin">
    <h2> Invalid Password Login</h2>
    <table>
      <tr>
        <td><label for="adminusername">Username</label></td>
      </tr>
      <tr>
        <td><input type="text" name="admin_username" id="adminusername" required></td>
      </tr>
      <tr>
        <td><label for="adminpassword">Password</label></td>
      </tr>
      <tr>
        <td><input type="text" name="admin_password" id="adminpassword" required></td>
      </tr>
      <tr>
        <td><input type="submit" value="Login"></td>
      </tr>
    </table>
  </form>
</body>
</html>
