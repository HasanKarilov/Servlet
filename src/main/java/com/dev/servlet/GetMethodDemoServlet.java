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
public class GetMethodDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String title = "Passing parameters using GET method";

        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html><html><head><title>" + title + "</title></head>" +
        "<body><h2> Specially :  </h2>" + req.getParameter("specially") +
        "<h2> Experience : </h2>" + req.getParameter("experience") +
        "</body></html>");
    }
}
