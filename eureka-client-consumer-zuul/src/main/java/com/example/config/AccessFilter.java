package com.example.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;


@Component
public class AccessFilter extends ZuulFilter {
 
    @Override
    public String filterType() {
        //前置过滤器
        return "pre";
    }
 
    @Override
    public int filterOrder() {
        //优先级，数字越大，优先级越低
        return 0;
    }
 
    @Override
    public boolean shouldFilter() {
        //是否执行该过滤器，true代表需要过滤
        return true;
    }
 
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest(); 
        System.out.println("*******************"+request.getRequestURL());
        System.out.println(request.getServletPath());
        //获取传来的参数accessToken
        Object accessToken = request.getParameter("accessToken");
//        if(accessToken == null) {
//            //过滤该请求，不往下级服务去转发请求，到此结束
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            ctx.setResponseBody("{\"result\":\"accessToken为空!\"}");
//            ctx.getResponse().setContentType("text/html;charset=UTF-8");
//            return null;
//        }
        //如果有token，则进行路由转发
        //这里return的值没有意义，zuul框架没有使用该返回值
        return null;
    }
 
}