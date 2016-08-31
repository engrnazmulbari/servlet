package com.example.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample
 */
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
		
		if(request.getParameter("firstName")==null || request.getParameter("lastName")==null){
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		request.setAttribute("firstname", firstName);
		request.setAttribute("lastname",lastName);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
		
		//out.println("Hello " + firstName+" "+lastName);
	}

}
