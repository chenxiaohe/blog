package com.github.river.blog.service.Impl;


import com.github.river.blog.dao.CommentMapper;
import com.github.river.blog.model.Comment;
import com.github.river.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> queryByArticle(Long articleId) {
        List<Comment> commentList = commentMapper.queryByArticle(articleId);
        return commentList;
    }

    @Override
    public int insert(Comment comment) {
        int res = commentMapper.insert(comment);
        return res;
    }

    @Override
    public int update(Comment comment) {
        int res = commentMapper.update(comment);
        return res;
    }
}
