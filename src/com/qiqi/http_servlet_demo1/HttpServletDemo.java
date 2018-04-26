package com.qiqi.http_servlet_demo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HttpServletDemo extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        System.out.println(req.getMethod());
        System.out.println(req.getParameterNames());
        Enumeration<String> names = req.getParameterNames();
        while (names.hasMoreElements()) {
            String element = names.nextElement();
            System.out.println(req.getParameter(element));
        }

        PrintWriter writer = resp.getWriter();
        writer.write("注册成功");
    }
}
