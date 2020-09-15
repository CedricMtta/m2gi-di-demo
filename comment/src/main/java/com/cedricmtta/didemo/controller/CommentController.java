package com.cedricmtta.didemo.controller;

import com.cedricmtta.didemo.dto.CommentDto;
import com.cedricmtta.didemo.service.CommentService;
import com.cedricmtta.didemo.service.UserPreferenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private final CommentService commentService;
    private final UserPreferenceService userPreferenceService;

    public CommentController(CommentService commentService,
                             UserPreferenceService userPreferenceService) {
        this.commentService = commentService;
        this.userPreferenceService = userPreferenceService;
    }

    @GetMapping
    public List<CommentDto> findAll() {
        userPreferenceService.findAll();
        return commentService.findAll();
    }
}
