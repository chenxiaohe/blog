package com.github.river.blog.controller;

import com.github.river.blog.model.Article;
import com.github.river.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController implements BlogControllerInterface {
    @Autowired
    ArticleService articleService;

    /**
     * GET /article/tech
     *
     * @return articleList
     */
    @RequestMapping(value = TECH_LIST_URL, method = RequestMethod.GET)
    public List<Article> techList() {
        List<Article> articleList = articleService.queryList(1);
        for (Article article : articleList) {
            System.out.println(article);
        }
        return articleList;
    }

    /**
     * GET /article/live
     *
     * @return articleList
     */
    @RequestMapping(value = LIVE_LIST_URL, method = RequestMethod.GET)
    public List<Article> liveList() {
        List<Article> articleList = articleService.queryList(2);
        for (Article article : articleList) {
            System.out.println(article);
        }
        return articleList;
    }

    /**
     * GET /article/me
     *
     * @return articleList
     */
    @RequestMapping(value = ME_URL, method = RequestMethod.GET)
    public List<Article> meList() {
        List<Article> articleList = articleService.queryList(3);
        for (Article article : articleList) {
            System.out.println(article);
        }
        return articleList;
    }

    /**
     * GET /article/detail
     *
     * @return articleList
     */
    @RequestMapping(value = ARTICLE_DETAIL_URL, method = RequestMethod.GET)
    public List<Article> detail(@RequestParam Long id) {
        List<Article> articleList = articleService.detail(id);
        return articleList;
    }

    /**
     * POST /article/publish
     *
     * @return int res
     */
    @RequestMapping(value = ARTICLE_PUBLISH_URL, method = RequestMethod.POST)
    public int insert(@RequestBody Article article) {
        System.out.println(article);
        int res = articleService.insert(article);
        return res;
    }

    /**
     * POST /article/update
     *
     * @return int res
     */
    @RequestMapping(value = ARTICLE_UPDATE_URL, method = RequestMethod.POST)
    public int update(@RequestBody Article article) {
        System.out.println(article.getCreateDate());
        int res = articleService.update(article);
        return res;
    }


}
