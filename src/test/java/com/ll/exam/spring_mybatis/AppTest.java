package com.ll.exam.spring_mybatis;

import com.ll.exam.spring_mybatis.article.dto.Article;
import com.ll.exam.spring_mybatis.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Transactional
class AppTest {
	@Autowired
	private ArticleService articleService;

	@Test
	@DisplayName("게시물들 조회")
	void t1() {
		List<Article> articles = articleService.getArticles();
		System.out.println(articles);
		assertThat(articles.size()).isEqualTo(0);
	}

	@Test
	@DisplayName("게시물 작성")
	void t2() {
		articleService.write("제목3", "내용3");
	}

	@Test
	@DisplayName("게시물 단건 조회")
	void t3() {
		Article article = articleService.getArticleById(1L);
		assertThat(article).isNotNull();
	}

	@Test
	@DisplayName("게시물 검색")
	void t4() {
		Article article = articleService.getArticleBySubject("제목2");
		assertThat(article.getSubject()).isEqualTo("제목2");
	}

	@Test
	@DisplayName("게시물 검색2")
	void t5() {
		List<Article> articles = articleService.search("subject","1");
		assertThat(articles.size()).isEqualTo(1);

		articles = articleService.search("subject","제목");
		assertThat(articles.size()).isEqualTo(2);

		articles = articleService.search("subject","2");
		assertThat(articles.size()).isEqualTo(1);
	}


}
