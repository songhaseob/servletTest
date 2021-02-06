package kr.or.ddit.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionLoginServlet.do")
public class SessionLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// GET방식으로 요청하면 세션을 확인해서 세션이 없으면 로그인 폼(sessionLogin.jsp)으로 이동
		// 세션이 있으면 sessionResult.jsp로 이동
		
		HttpSession session = request.getSession();
		
		String viewPage = null;  // 이동할 페이지 경로가 저장될 변수
		
		String userId = (String) session.getAttribute("USERID");
		if(userId == null) {  // 세션값이 없으면...
			viewPage = "/03/sessionLogin.jsp";
		}else {  // 세션값이 있으면...
			viewPage = "/03/sessionResult.jsp";
		}
		
		// 페이지 이동하기  ==> forward방식과 redirect방식 중 하나를 사용한다.
		// 방법1) redirect방식
		response.sendRedirect(request.getContextPath() + viewPage);
		
		// 방법2) forward방식
//		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
//		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 방식으로 요청하면 로그인 검증 작업을 수행한다.
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userid");
		String pass = request.getParameter("pass");
		
		String viewPage = "/03/sessionResult.jsp";
		
		HttpSession session = request.getSession();
		
		if((userId!=null) && (pass!=null)) {
			if("admin".equals(userId) && "1234".equals(pass)) { // 로그인 성공
				session.setAttribute("USERID", userId);
			}
		}
		
		// 페이지 이동하기  ==> forward방식과 redirect방식 중 하나를 사용한다.
		// 방법1) redirect방식
//		response.sendRedirect(request.getContextPath() + viewPage);
		
		// 방법2) forward방식
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		rd.forward(request, response);
		
	}

}
