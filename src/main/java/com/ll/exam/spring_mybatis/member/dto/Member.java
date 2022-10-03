package com.ll.exam.spring_mybatis.member.dto;

import lombok.Data;

@Data
public class Member {
    private long id;
    private String username;
    private String password;
    private String name;
    private String email;

    public boolean matchPassword(String password) {
        System.out.println("password = " + password);
        System.out.println("this.password.substring(\"{noop}\".length()) = " + this.password.substring("{noop}".length()));

        return this.password.substring("{noop}".length()).equals(password);
    }
}
