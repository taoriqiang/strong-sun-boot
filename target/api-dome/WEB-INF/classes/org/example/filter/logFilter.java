package org.example.filter;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author riqiang.tao
 * @date 10/20/2020 1:19 PM
 */
@WebFilter(filterName = "filter_one", urlPatterns = "/*")
public class logFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String contextPath = request.getContextPath();
        String logPath = "/webapp/index.html";
        if(!StringUtils.isBlank(contextPath) && !contextPath.equals("/")){
            logPath = contextPath + logPath;
        }
        if (request.getRequestURL().toString().endsWith("/")) {
            response.sendRedirect(logPath);
        } else {
            filterChain.doFilter(servletRequest, servletResponse); // 让目标资源执行，放行
        }
    }

    @Override
    public void destroy() {

    }
}
