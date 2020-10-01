<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<form action ="addStud">
<input type="text"  name="sid"><br>
<input type="text"  name="sname"><br>
<input type="text"  name="tech"><br>
<input type="submit" value="login">
</form><br><br>

<form action="getStudent">
<input type="text" name ="sid">
<input type="submit">
</form><br><br>

<form action ="removeStudent">
<input type="text"  name="sid"><br>

<input type="submit" value="remove">
</form>

</form>
</body>
</html>