package net.cloudyrock.demo2.module2.impl;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class FilterDemo implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpThreadLocal.setRequest((HttpServletRequest)request);
        HttpThreadLocal.setResponse((HttpServletResponse)response);
        chain.doFilter(request, response);
        HttpServletRequest req = HttpThreadLocal.getRequest();
        HttpThreadLocal.clean();
        HttpServletRequest req2 = HttpThreadLocal.getRequest();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
