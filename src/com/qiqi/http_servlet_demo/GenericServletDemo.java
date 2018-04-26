package com.qiqi.http_servlet_demo;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public abstract class GenericServletDemo implements Servlet, ServletConfig {

    private ServletConfig config;

    public ServletConfig getConfig() {
        return config;
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }
    //专门给子类初始化的
    protected void init (){}

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public abstract void service(ServletRequest servletRequest,
                                 ServletResponse servletResponse)
            throws ServletException, IOException;

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    public String getServletName() {
        return this.config.getServletName();
    }

    public ServletContext getServletContext() {
        return this.getServletContext();
    };

    public String getInitParameter(String var1) {
        return this.config.getInitParameter(var1);
    };

    public Enumeration<String> getInitParameterNames() {
        return this.config.getInitParameterNames();
    };
}
