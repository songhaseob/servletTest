<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Session 연습용 Main 페이지 입니다.</h2>

<a href="<%=request.getContextPath() %>/sessionLoginServlet.do">
LOGIN하기</a>

</body>
</html>





<!-- 
'sessionMain.jsp'문서에서 'LOGIN하기' 링크를 클릭하면
'sessionLogin.jsp'문서가 나오도록 하고,

(회원ID : admin, 비밀번호: 1234)
'sessionLogin.jsp'문서에서 ID와 PASSWORD를 입력한 후
LOGIN버튼을 누르면 회원 여부를 검사해서
회원이면 세션에 회원ID를 저장한 후 
'sessionResult.jsp'문서로 이동한다.
회원이 아니면 세션에 아무것도 저장하지 않고 
'sessionResult.jsp'문서로 이동한다.

'sessionResult.jsp'문서에서는 세션값으로 로그인한 회원ID가
있으면 
' XXX님 어서오세요.  로그아웃' 메시지를 출력하고
'로그아웃' 글씨를 클릭하면 세션을 삭제한 후 처음 문서로 돌아간다.

없으면
script로 alert("로드인 실패');를 실행한 후 이전 페이지로 이동한다.





 -->