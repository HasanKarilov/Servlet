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
public class ErrorDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer code = (Integer) req.getAttribute("javax.servlet.error.status_code");
        resp.setContentType("text/html");
        String docType = "<!DOCTYPE html>";

        PrintWriter writer = resp.getWriter();
        writer.println(docType + "<html><head><title> Error Handling </title></head>" +
        "<body><h1>Error Information</h1>\n" + "Code : " + code +
        "</body></html>");

    }
}
