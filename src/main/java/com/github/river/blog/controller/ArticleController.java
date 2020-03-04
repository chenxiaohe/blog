package com.github.river.blog.controller;

import com.github.river.blog.model.Article;
import com.github.river.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/queryList")
    public List<Article> queryList(){
        List<Article> articleList =  articleService.queryList();
        for (Article article : articleList) {
            System.out.println(article);
        }
        return articleList;
    }
}
