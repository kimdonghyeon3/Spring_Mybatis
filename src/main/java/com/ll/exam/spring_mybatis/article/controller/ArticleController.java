package com.ll.exam.spring_mybatis.article.controller;

import com.ll.exam.spring_mybatis.article.dto.Article;
import com.ll.exam.spring_mybatis.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/list")
    public String  showList(Model model){

        List<Article> articles = articleService.getArticles();

        model.addAttribute("articles",articles);

        return "article/list";
    }


}
