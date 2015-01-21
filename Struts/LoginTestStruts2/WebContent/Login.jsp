<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Example</h1>
   <form action="login">
      <label for="userName">Name</label>
      <input type="text" name="name"/><br/>
        <label for="password">Password</label>
      <input type="password" name="password"/><br/>
      <input type="submit" value="Submit"/>
   </form>
</body>
</html>