package com.qiqi.HelloServlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class HelloServlet implements Servlet {

    private ServletConfig config;

    public HelloServlet() {
        System.out.println("创建");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("初始化");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("运行");
        Enumeration<String> names = this.config.getInitParameterNames();
        while (names.hasMoreElements()) {
            System.out.println(this.config.getInitParameter(names.nextElement()));
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁");

    }
}
