package com.qiqi.cookie;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie/list")
public class ListServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        Cookie[] cookies = req.getCookies();
        String username = "";
        for (Cookie cookie : cookies) {
            if ("username".equals(cookie.getName())) {
                username = cookie.getValue();
            }
        }

        PrintWriter writer = resp.getWriter();
        writer.write("<html><body>");
        writer.write("当前用户:" + username + "<br>");
        for (int i = 0; i < 50; i++) {
            writer.write("<a href='/cookie/get?username="+username+"'>邮件" + i + "</a><br>");
        }
        writer.write("</html></body>");
    }
}
