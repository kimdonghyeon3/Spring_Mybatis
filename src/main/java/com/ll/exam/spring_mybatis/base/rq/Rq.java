package com.ll.exam.spring_mybatis.base.rq;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
@Getter
@Setter
public class Rq {

    private int count;
    private String name;

    public void increaseCount(){
        this.count ++;
    }


}
