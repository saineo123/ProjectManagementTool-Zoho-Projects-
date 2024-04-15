package com.iamneo.ProjectManagementSystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.iamneo.ProjectManagementSystem.model.Comment;
import com.iamneo.ProjectManagementSystem.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // Endpoint to create a new comment

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.createComment(comment);
    }
    // Endpoint to update an existing comment
    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable("id") Long id, @RequestBody Comment updatedComment) {
        return commentService.updateComment(id, updatedComment);
    }
        // Endpoint to get all comments

    @GetMapping
    public Iterable<Comment> getAll(){
        return commentService.getComment();
    }
}
