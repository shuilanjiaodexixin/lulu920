package com.example.web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletDemo1", value = "/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method =request.getMethod();
        System.out.println(method);
        String contextPath= request.getContextPath();
        System.out.println(contextPath);
        String servlet = request.getServletPath();
        System.out.println(servlet);
        String url = request.getRequestURI();
        StringBuffer  urlb =  request.getRequestURL();
        String  prot  = request.getProtocol();
        String raddr= request.getRemoteAddr();
        System.out.println(url+urlb+prot+raddr);
        String qstr  = request.getQueryString();
        System.out.println(qstr);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method =request.getMethod();
        System.out.println(method);
        String contextPath= request.getContextPath();
        System.out.println(contextPath);
        String servlet = request.getServletPath();
        System.out.println(servlet);
        String url = request.getRequestURI();
        StringBuffer  urlb =  request.getRequestURL();
        String  prot  = request.getProtocol();
        String raddr= request.getRemoteAddr();
        System.out.println(url+urlb+prot+raddr);
        String qstr  = request.getQueryString();
        System.out.println(qstr);
    }
}
