package com.ll.exam.spring_mybatis.article.repository;

import com.ll.exam.spring_mybatis.article.dto.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    @Insert("""
            <script>
            INSERT INTO article
            SET createDate = NOW(),
            modifyDate = NOW(),
            subject = #{subject},
            content = #{content}
            </script>
            """)
    void write(@Param("subject") String subject, @Param("content") String content);

    @Select("""
            <script>
            SELECT *
            FROM article
            where id = #{id}
            </script>
            """)
    Article getArticleById(@Param("id") long id);

    @Select("""
            <script>
            SELECT *
            FROM article
            where subject = #{subject}
            </script>
            """)
    Article getArticleBySubject(String subject);

    @Select("""
            <script>
            SELECT *
            FROM article
            where 1
            <if test="s != ''">
            AND subject LIKE CONCAT('%',#{s},'%')
            </if>
            </script>
            """)
    List<Article> search(String title, @Param("s") String s);
}