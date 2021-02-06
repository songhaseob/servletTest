<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 로그인 결과 페이지</title>
</head>
<body>
<%
	// JSP문서에서는 세션은 'session'이라는 이름으로 저장되어 있다.
	String userId = (String)session.getAttribute("USERID");

	if(userId==null){  // 세션이 없으면..
%>
	<script>
		alert("로그인 실패!!");
		
		//location.href = "이동할 페이지의 URL주소";  // 방법1
<%-- 		location.href = "<%=request.getContextPath()%>/03/sessionLogin.jsp"; --%>
		location.href = "<%=request.getContextPath()%>/sessionLoginServlet.do";
		//history.go(-1);	// 방법2
	</script>
<%
	}else{	// 세션이 있으면
%>
	<h3><%=userId %>님 반갑습니다.</h3>
	<a href="<%=request.getContextPath()%>/sessionLogoutServlet.do">로그아웃</a>
<%
	}
%>
</body>
</html>