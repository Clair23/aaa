package com.servlet.Demo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by liud on 2018/3/27.
 */
public class ServletDemo1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> names= req.getParameterNames();
        while (names.hasMoreElements()){
            System.out.print(names.nextElement());
        }
    }


}
