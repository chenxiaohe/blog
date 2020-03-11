package com.github.river.blog.dao;

import com.github.river.blog.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ArticleMapper {
    List<Article> queryList(Integer type);

    List<Article> detail(Long id);

    int insert(Article article);

    int update(Article article);
}
