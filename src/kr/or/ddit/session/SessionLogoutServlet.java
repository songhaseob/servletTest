package kr.or.ddit.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionLogoutServlet.do")
public class SessionLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션을 삭제한 후 sessionMain.jsp로 이동한다.
		
		HttpSession session = request.getSession();
		
		//session.removeAttribute("USERID");  // 방법1
		session.invalidate();		// 방법2
		
		response.sendRedirect(request.getContextPath() + "/03/sessionMain.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
