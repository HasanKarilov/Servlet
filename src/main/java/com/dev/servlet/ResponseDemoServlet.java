package com.dev.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by hanaria on 5/18/17.
 */
public class ResponseDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        String title = "HTTP Servlet Response Demo";
        String docType = "<!DOCTYPE html>";

        writer.println(docType +
                "<html>\n" + "<head><title>" + title + "</title></head>\n" +
                "<body>" +
                "<h1>" + "response content type - " + resp.getContentType() + "</h1>" +
                "<h1>"+ "response status - " + resp.getStatus() + "</h1>" +
                "<h1>"+ "response character encoding - " + resp.getCharacterEncoding() + "</h1>" +
                "</body>");
    }
}
