<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>
    <h1>Welcome to the login section.</h1>
    <p>Please enter your email and password to attend the voting.</p>
    <br/>
    <FORM ACTION="http://localhost:8080/login"
          METHOD="POST">
        Mail:
        <INPUT TYPE="email" NAME="mail" required><BR>
        Password:
        <INPUT TYPE="password" NAME="password" required><BR>
        <INPUT TYPE="SUBMIT" VALUE="Wyslij">
    </FORM>
</body>
</html>
