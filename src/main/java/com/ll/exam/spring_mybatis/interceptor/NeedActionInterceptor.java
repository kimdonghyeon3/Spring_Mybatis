package com.ll.exam.spring_mybatis.interceptor;

import com.ll.exam.spring_mybatis.base.rq.Rq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
@Slf4j
@RequiredArgsConstructor
public class NeedActionInterceptor  implements HandlerInterceptor {

    private final Rq rq;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("NeedActionInterceptor::preHandle 실행됨");

        log.debug("rq : " + rq + ", rq.count : " + rq.getCount());

        HttpSession session = request.getSession();

        Long loginedMemberId = (Long) session.getAttribute("loginedMemberId");

        boolean isLogined = loginedMemberId != null;

        if(!isLogined){
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().append("로그인 후 이용바랍니다.");

            return false;
        }

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}