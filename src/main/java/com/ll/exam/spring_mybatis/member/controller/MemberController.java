package com.ll.exam.spring_mybatis.member.controller;


import com.ll.exam.spring_mybatis.base.rq.Rq;
import com.ll.exam.spring_mybatis.member.dto.Member;
import com.ll.exam.spring_mybatis.member.service.MemberService;
import com.ll.exam.spring_mybatis.util.Util;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;
    private final Rq rq;

    @GetMapping("/member/login")
    public String showLogin(){
        return "member/login";
    }

    @PostMapping("/member/login")
    public String login(String username, String password, HttpSession session){

        Member member = memberService.getMemberByUsername(username);

        if(member == null){
            return "redirect:/?msg=" + Util.url.encode("존재하지 않는 회원입니다.");
        }

        if(member.matchPassword(password) == false){
            return "redirect:/?msg=" + Util.url.encode("패스워드가 일치하지 않습니다.");
        }

        rq.setName(member.getName());
        session.setAttribute("loginedMemberId", member.getId());

        return "redirect:/?msg=" + Util.url.encode("로그인 성공");
    }

    @GetMapping("/member/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("loginedMemberId");

        return "redirect:/?msg=" + Util.url.encode("로그아웃 성공");
    }
}
