package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;

import javax.servlet.http.HttpServlet;

public abstract class BaseHttpServlet extends HttpServlet {
    protected <T> T getBean(String name) {
        return (T) getServletContext().getAttribute(name);
    }
}
