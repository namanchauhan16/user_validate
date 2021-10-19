package com.simplilearn.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter implements Filter {

    public TestFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(username.equals("naman")&&password.equals("naman@123")) {
		chain.doFilter(request, response);
		}
		else {
			out.print("Something went wrong with the usename and password!");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
