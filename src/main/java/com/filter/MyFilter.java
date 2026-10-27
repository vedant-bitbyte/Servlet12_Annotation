package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

// @WebFilter("/anno") --> means that this the annotations mapping of this Filter to request on the /anno url

@WebFilter(
		urlPatterns = {"/test", "/anno", "/annoServlet"}
		// This are url patterns for which this filter will run, "/*" runs for every request to every url
		)
public class MyFilter extends HttpFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("PRE Filter for the Request...");
		
		chain.doFilter(request, response);
		
		System.out.println("POST Filter for the Response...");
	}
}
