<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response객체 - forward, sendRedirect 연습</title>
</head>
<body>
<h2>forward, sendRedirect 연습</h2>
<hr>
<form method="post" action="/servletTest/responseTest01.do">
	forward로 처리하기 : <input type="text" name="username">
	<input type="submit" value="확인">
</form>
<hr>
<form method="post" action="/servletTest/responseTest02.do">
	response.sendRedirect로 처리하기 :
	<input type="text" name="username">
	<input type="submit" value="확인">
</form>


</body>
</html>