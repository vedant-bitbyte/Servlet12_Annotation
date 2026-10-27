package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// So this is now Listener, we used annotation mapping, not the web.xml mapping
// Listener runs when the Servlet is created and destroyed..
// Here we can set key-values to the ServletContext, which is available to all the Servlets
@WebListener
public class MyListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("On Closed...");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("On Startup...");
    	
        ServletContext servletContext = sce.getServletContext();
        
        servletContext.setInitParameter("admin", "admin123");
    }
	
}
