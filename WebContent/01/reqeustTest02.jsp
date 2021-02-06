<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request객체 연습</title>
</head>
<body>
<h2>Request객체 연습(숫자 입력은 정수형으로 입력하세요.)</h2>
<hr>
<form name="testForm" method="post" 
	action="/servletTest/requestTest02.do">
	<table>
	<tr>
		<td><input type="text" size="8" name="num1"></td>
		<td>
			<select name="op">
				<option value="+"> +(덧셈) </option>
				<option value="-"> -(뺄셈) </option>
				<option value="*"> * </option>
				<option value="/"> / </option>
				<option value="%"> % </option>
			</select>
		</td>
		<td><input type="text" size="8" name="num2"></td>
		<td><input type="submit" value="확인"></td>
	</tr>
	
	</table>
</form>
</body>
</html>