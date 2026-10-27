package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// So now here, we use annotations to map the servlet to the link on the JSP.
// Firstly in Web Dynamic Project version 2.3, we were using web.xml to map this, but now in 3.0+ (here 4.0) we use
// this annotations which reduces the efforts.

// So, @WebServlet("/test")  --> means that this Servlet will run when the /test url is hit, no the JSP we link this

@WebServlet(
		name = "Anno",
		urlPatterns = {"/test", "/anno", "/annoServlet"}, // So here we are able to assign multiple url patterns, which
														  // triggers the this same Servlet
		
		initParams = { // so here initParams means we can access the ServletConfig, 
				// And we set key-value variables in it using the @WebInitParam as below, so that
				// we can access this values in below class using the ServletConfig obj.
				
				@WebInitParam(name="url1", value="jdbc:xyz1"),
				@WebInitParam(name="url2", value="jdbc:xyz2")
			}
		)
public class Anno extends HttpServlet {
	private static final long serialVersionUID = 1L; // This helps in Serializable  -- > unique identifier 
	// used during serialization and deserialization to verify that the sender and receiver 
	// versions of a Serializable class are compatible.

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("Servlet Started...\n\n");
		
		ServletConfig servletConfig = getServletConfig(); // The HttpServlet class has already this method, 
														  // so we are able to use it here directly
		
		ServletContext servletContext = getServletContext(); // This method is also in the HttpServlet class
		
		response.getWriter().print("ServletConfig parameters (url1): " 
						+ servletConfig.getInitParameter("url1")
						+ "\n\nServletConcontext parameters (admin): "
						+ servletContext.getInitParameter("admin")
				);
	}

}
