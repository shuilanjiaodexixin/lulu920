package com.example.lulu920;

import com.example.domain.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取request域中共享的user对象
        User user = (User) request.getAttribute("user");

        if (user != null) {
            //给页面写一句话

            //设置编码
            response.setContentType("text/html;charset=utf-8");
            //输出
            response.getWriter().write("登录成功！" + user.getUSERNAME() + ",欢迎您");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
