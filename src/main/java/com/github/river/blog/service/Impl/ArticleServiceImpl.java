package com.github.river.blog.service.Impl;

import com.github.river.blog.controller.ArticleController;
import com.github.river.blog.dao.ArticleMapper;
import com.github.river.blog.model.Article;
import com.github.river.blog.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    private static final Logger log = LoggerFactory.getLogger(ArticleController.class);


    @Override
    public List<Article> queryList(Integer type) {
        List<Article> article = articleMapper.queryList(type);
        return article;
    }

    @Override
    public List<Article> detail(Long id) {
        List<Article> article = articleMapper.detail(id);
        return article;
    }

    @Override
    public int insert(Article article) {
        int res = articleMapper.insert(article);
        return res;
    }

    @Override
    public int update(Article article) {
        int res = articleMapper.update(article);
        return res;
    }
}
