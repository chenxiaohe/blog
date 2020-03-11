package com.github.river.blog.dao;

import com.github.river.blog.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
    List<Comment> queryByArticle(Long articleId);

    int insert(Comment comment);

    int update(Comment comment);

}
