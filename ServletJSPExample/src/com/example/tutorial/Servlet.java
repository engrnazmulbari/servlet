package com.example.tutorial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName"); 
		
		if(firstName==null || lastName==null){
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);;
			return;
		}
		request.setAttribute("firstname",firstName);
		request.setAttribute("lastname",lastName);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
		
		
	}

	

}
