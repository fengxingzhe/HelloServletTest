package com.qiqi.param;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String username = req.getParameter("username");

        PrintWriter writer = resp.getWriter();
        writer.write("<html><body>");
        writer.write("当前用户:" + username + "<br>");
        writer.write("<a href='/list?username=" + username + "'>收信箱(300)</a>");
        writer.write("</html></body>");
    }
}
