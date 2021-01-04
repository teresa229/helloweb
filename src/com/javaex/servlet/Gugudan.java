package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		
		//*서블릿 구구단 코드*//
		//step 1 : 단이 몇개인지 확인. html에서 java를 구분할 필요가 없다. <%%> 필요없다.
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		//step 2 : html테이블을 만들어 문서형식으로 보내주어야 한다. 응답 ->reponse에 넣어주기.
		PrintWriter out = response.getWriter();
		out.println("<table border='1'>");
		for(int i=0; i<9; i++) {
			out.println("     <tr>");
			out.println("     <td>" + dan +" </td>");
			out.println("     <td>" + i +" </td>");
			out.println("     <td>" + dan*i +" </td>");
			out.println("     </tr>");
		}
		out.println("</table>");
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	}

}
