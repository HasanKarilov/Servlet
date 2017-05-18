package com.dev.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by hanaria on 5/19/17.
 */
public class PostMethodDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String title = "Passing parameters using GET method";
        String docType = "<!DOCTYPE html>";

        PrintWriter writer = resp.getWriter();

        writer.println(docType + "<html><head><title>" + title + "</title></head>" +
                "<body><h2> Specially :  </h2>" + req.getParameter("specialty") +
                "<h2> Experience : </h2>" + req.getParameter("experience") +
                "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
