package com.ll.exam.spring_mybatis.article.service;

import com.ll.exam.spring_mybatis.article.dto.Article;
import com.ll.exam.spring_mybatis.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.getArticles();
    }

    public void write(String subject, String content) {
        articleRepository.write(subject, content);
    }

    public Article getArticleById(long id) {
        return articleRepository.getArticleById(id);
    }

    public Article getArticleBySubject(String subject) {
        return articleRepository.getArticleBySubject(subject);
    }

    public List<Article> search(String title, String s) {
        return articleRepository.search(title, s);
    }
}