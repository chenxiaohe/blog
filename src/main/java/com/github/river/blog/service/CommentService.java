package com.github.river.blog.service;

import com.github.river.blog.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> queryByArticle(Long articleId);

    int insert(Comment comment);

    int update(Comment comment);
}
