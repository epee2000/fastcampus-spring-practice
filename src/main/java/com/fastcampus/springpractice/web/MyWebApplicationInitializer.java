package com.fastcampus.springpractice.web;

import com.fastcampus.springpractice.config.Config;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

  // The following example of the Java configuration registers and initializes the DispatcherServlet,
  // which is auto-detected by the Servlet container (see Servlet Config):

  @Override
  public void onStartup(ServletContext servletContext) { // main() 은 더이상 필요가 없다!
    // Load Spring web application configuration
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(Config.class);

    // Create and register the DispatcherServlet
    DispatcherServlet servlet = new DispatcherServlet(context);
    ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
    registration.setLoadOnStartup(1);
    registration.addMapping("/");
  }
}