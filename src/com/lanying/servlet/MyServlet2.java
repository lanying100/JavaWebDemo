package com.lanying.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lanying on 2017/10/19 0019.
 */
public class MyServlet2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        print("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        print("service");
    }

    @Override
    public void destroy() {
        print("destroy");
    }

    private void print(String methodName){
        System.out.println(getClass().getSimpleName()+" method name:"+methodName+" thread name:"+Thread.currentThread().getName());
    }
}
