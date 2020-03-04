package com.github.river.blog.service.Impl;

import com.github.river.blog.dao.ArticleMapper;
import com.github.river.blog.model.Article;
import com.github.river.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> queryList() {
        List<Article> article = articleMapper.queryList();
        return article;
    }
}
