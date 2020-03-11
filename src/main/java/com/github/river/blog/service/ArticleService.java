package com.github.river.blog.service;

import com.github.river.blog.model.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    List<Article> queryList(Integer type);

    List<Article> detail(Long id);

    int insert(Article article);

    int update(Article article);

}
