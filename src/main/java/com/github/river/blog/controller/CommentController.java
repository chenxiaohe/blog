package com.github.river.blog.controller;

import com.github.river.blog.model.Comment;
import com.github.river.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController implements BlogControllerInterface {
    @Autowired
    CommentService commentService;


    /**
     * COMMENT_LIST_URL
     *
     * @return Comment
     */
    @RequestMapping(value = COMMENT_LIST_URL, method = RequestMethod.GET)
    public List<Comment> commentList(@RequestParam Long articleId) {
        List<Comment> list = commentService.queryByArticle(articleId);
        return list;
    }

    @RequestMapping(value = COMMENT_PUBLISH_URL, method = RequestMethod.POST)
    public int insert(@RequestBody Comment comment) {
        comment.setParentId((long) 0);
        int res = commentService.insert(comment);
        return res;
    }

    @RequestMapping(value = COMMENT_Reply_URL, method = RequestMethod.POST)
    public int replay(@RequestBody Comment comment) {
        int res = commentService.insert(comment);
        return res;
    }

    @RequestMapping(value = COMMENT_UPDATE_URL, method = RequestMethod.POST)
    public int update(@RequestBody Comment comment) {
        int res = commentService.update(comment);
        return res;
    }
}
