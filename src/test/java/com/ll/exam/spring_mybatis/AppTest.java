package com.ll.exam.spring_mybatis;

import com.ll.exam.spring_mybatis.article.dto.Article;
import com.ll.exam.spring_mybatis.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class AppTest {
	@Autowired
	private ArticleService articleService;

	@Test
	@DisplayName("게시물 리스트 반환")
	void t1() {
		List<Article> articles = articleService.getArticles();
		System.out.println(articles);
	}
	
	@Test
	@DisplayName("게시물 작성")
	void t2(){
		articleService.write("제목3", "내용3");
	}
}
