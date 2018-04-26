package com.qiqi.http_servlet_demo;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpServletDemo extends GenericServletDemo {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest servletRequest1 = (HttpServletRequest) servletRequest;
        HttpServletResponse servletResponse1 = (HttpServletResponse) servletResponse;

        service(servletRequest1, servletResponse1);
    }

    public void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String method = servletRequest.getMethod();
        if ("GET".equals(method)) {
            doGet(servletRequest, servletResponse);
        }else {
            doPost(servletRequest, servletResponse);
        }
    }

    private void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        System.out.println("post方法");
    }

    private void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        System.out.println("get方法");
    }
}
