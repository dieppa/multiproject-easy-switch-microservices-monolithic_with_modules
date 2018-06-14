package net.cloudyrock.demo2.module2.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpThreadLocal {

    private static final ThreadLocal<HttpServletRequest> requestThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<HttpServletResponse> responseThreadLocal = new ThreadLocal<>();

    public static void setRequest(HttpServletRequest request) {
        requestThreadLocal.set(request);
    }

    public static void setResponse(HttpServletResponse response) {
        responseThreadLocal.set(response);
    }

    public static HttpServletRequest getRequest() {
        return requestThreadLocal.get();
    }

    public static HttpServletResponse getResponse() {
        return responseThreadLocal.get();
    }

    public static void clean() {
        responseThreadLocal.set(null);
        requestThreadLocal.set(null);
    }

}
