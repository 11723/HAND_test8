package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Service.chaxun;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	chaxun cx=new chaxun();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Boolean b=null;
		RequestDispatcher rd=null;
		String forward=null;
		String title=request.getParameter("title");
		System.out.println(title);
		b=cx.serviceDelete(title);
		//rd=request.getRequestDispatcher(arg0);
		//判断boolean的值进行页面跳转
		if(b==true)
		{
			forward="/da1/deleteSuccess.jsp";
		}
		else{
			forward="/da1/deleteError.jsp";
		}
		rd=request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

}
