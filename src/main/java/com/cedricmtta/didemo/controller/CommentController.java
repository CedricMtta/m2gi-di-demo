package com.cedricmtta.didemo.controller;

import com.cedricmtta.didemo.dto.CommentDto;
import com.cedricmtta.didemo.service.CommentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<CommentDto> findAll() {
        return commentService.findAll();
    }
}
