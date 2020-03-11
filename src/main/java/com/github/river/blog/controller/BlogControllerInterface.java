package com.github.river.blog.controller;

public interface BlogControllerInterface {
    /**
     * 技术文章首页
     */
    String TECH_LIST_URL = "/article/tech";
    /**
     * 文章发表
     */
    String ARTICLE_PUBLISH_URL = "/article/publish";
    /**
     * 文章修改
     */
    String ARTICLE_UPDATE_URL = "/article/update";
    /**
     * 关于生活首页
     */
    String LIVE_LIST_URL = "/article/live";
    /**
     * 关于我
     */
    String ME_URL = "/article/me";
    /**
     * 文章详情
     */
    String ARTICLE_DETAIL_URL = "/article/detail";
    /**
     * 留言列表
     */
    String COMMENT_LIST_URL = "/comment/list";
    /**
     * 留言发表
     */
    String COMMENT_PUBLISH_URL = "/comment/publish";
    /**
     * 留言更新
     */
    String COMMENT_UPDATE_URL = "/comment/update";
    /**
     * 留言回复
     */
    String COMMENT_Reply_URL = "/comment/reply";


}
