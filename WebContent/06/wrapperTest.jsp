<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/wrapperTestServlet.do">
회원ID : <input type="text" name="mem_id"><br><br>
회원이름 : <input type="text" name="mem_name"><br><br>
패스워드 : <input type="password" name="mem_pass"><br><br>
<input type="submit" value="전 송">
<input type="reset" value="취 소">
</form>
</body>
</html>