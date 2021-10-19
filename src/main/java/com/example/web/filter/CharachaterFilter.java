package com.example.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class CharachaterFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig)throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request  = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) rep;

        String  method = request.getMethod();
        if (method.equalsIgnoreCase("post")) {
            request.setCharacterEncoding("utf-8");
        }
        response.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(request,response);
    }



    @Override
    public void destroy(){

    }
}
