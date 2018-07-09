package com.imooc.web.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
//@Component
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("TimeFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        System.out.println("TimeFilter start");
        long start = new Date().getTime();

        chain.doFilter(servletRequest,servletResponse);
        System.out.println("TimeFilter 耗时:"+(new Date().getTime()-start));
        System.out.println("TimeFilter end");
    }

    @Override
    public void destroy() {
        System.out.println("TimeFilter destroy");
    }
}
