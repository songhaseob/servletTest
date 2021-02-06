package kr.or.ddit.reqres;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestTest02.do")
public class RequestTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("utf-8");
		
		String strNum1 = request.getParameter("num1");  // 입력한 첫번째 숫자
		String op = request.getParameter("op");			// 연산자
		String strNum2 = request.getParameter("num2");	// 입력한 두번째 숫자
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		double result = 0;	// 계산된 결과가 저장될 변수
		boolean calcOk = true;  // 계산 성공 여부를 저장할 변수 (false면 계산 불능상태)
		
		switch(op) {
			case "+" : result = num1 + num2; break; 
			case "-" : result = num1 - num2; break; 
			case "*" : result = num1 * num2; break; 
			case "/" : 
				if(num2==0) {
					calcOk = false;
				}else {
					result = (double)num1 / num2; 
				}
				break; 
			case "%" : 
				if(num2==0) {
					calcOk = false;
				}else {
					result = num1 % num2; 
				}
				break;
		}
		
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Request 연습</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>계산 결과</h2>");
		out.println("<hr>");
		//out.printf("%d %s %d = %f<br>", num1, op, num2, result);
		//out.println(num1 + " " + op + " " + num2 + " = " + result + "<br>");
		out.println(num1 + " " + op + " " + num2 + " = " );
		if(calcOk==true) {
			out.println(result + "<br>");
		}else {
			out.println("계산 불능 (0으로 나누기)<br>");
		}
		
		
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
