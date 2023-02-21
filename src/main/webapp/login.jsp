<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
