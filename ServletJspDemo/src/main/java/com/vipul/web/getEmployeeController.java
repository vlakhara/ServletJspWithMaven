package com.vipul.web;

import java.io.IOException;

import com.vipul.web.dao.EmployeeDao;
import com.vipul.web.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class getEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int uId = Integer.parseInt(request.getParameter("uId"));
		
		
		EmployeeDao dao = new EmployeeDao();
		Employee e1 = dao.getEmployee(uId);
		
		request.setAttribute("Employee", e1);
		RequestDispatcher rd = request.getRequestDispatcher("showEmployee.jsp");
		rd.forward(request, response);
		
	}

}
