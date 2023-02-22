<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Voting</title>
</head>
<body>
    <h1>Welcome to the voting section</h1>
    <p>Do not come back, now give the vote :)</p>
    <FORM ACTION="http://localhost:8080/result"
          METHOD="POST">
        First Vote Option:
        <INPUT TYPE="checkbox" NAME="check" value="1"><BR>
        Second Vote Option:
        <INPUT TYPE="checkbox" NAME="check" value="2"><BR>
        No Decision:
        <INPUT TYPE="checkbox" NAME="check" value="3"><BR>
        <INPUT TYPE="SUBMIT" VALUE="Wyslij">
    </FORM>
</body>
</html>
