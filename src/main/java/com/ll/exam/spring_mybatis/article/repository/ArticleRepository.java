package com.ll.exam.spring_mybatis.article.repository;

import com.ll.exam.spring_mybatis.article.dto.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleRepository {

    @Select("""
            <script>
            SELECT *
            FROM article
            </script>
            """)
    List<Article> getArticles();

    @Select("""
            <script>
            INSERT INTO article
            SET createDate = NOW(),
            modifyDate = NOW(),
            `subject` = '제목2',
            content = '내용2';
            </script>
            """)
    void write(String subject, String content);
}
