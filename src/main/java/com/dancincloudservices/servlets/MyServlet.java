package com.dancincloudservices.servlets;

import com.dancingcloudservices.model.MyModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = "/myservlet/request.do")
public class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
//        ServletOutputStream out = response.getOutputStream();
//        out.println("<HTML><BODY><H1>Hello!</H1><p>" + new Date() + "</p></BODY></HTML>");

        MyModel model = new MyModel();
        // read a query parameter from the input request
        String name = "Mx." + request.getParameter("name");
        model.setName(name);

        request.setAttribute("model", model);
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }
}
