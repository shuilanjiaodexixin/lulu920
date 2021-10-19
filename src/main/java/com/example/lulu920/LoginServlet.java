package com.example.lulu920;

//import com.example.dao.UserDao;
import com.example.domain.User;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username =  request.getParameter("username");
        String password =  request.getParameter("password");
        User loginuser =  new User();
//        loginuser.setUSERNAME(username);
//        loginuser.setPASSWORD(password);
//        Map<String, String[]> map =  request.getParameterMap();
//        User loginuser = new User();
//        try{
//            BeanUtils.populate(loginuser,map);
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException  e) {
//            e.printStackTrace();
//        }
//        UserDao dao = new UserDao();
//        User user = dao.login(loginuser);

//        if (user == null) {
//            //登陆失败
//            request.getRequestDispatcher("/failServlet").forward(request, response);
//        }else{
//                request.setAttribute("user", user);
//                request.getRequestDispatcher("/successServlet").forward(request,response);
//            }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
