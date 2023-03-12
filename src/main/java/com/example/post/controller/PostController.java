package com.example.post.controller;

import com.example.post.model.Post;
import com.example.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/post-api")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("add-post")
    public ResponseEntity addPost(@RequestBody Post postData)
    {
        int id=postService.addPost(postData);
        return new ResponseEntity("Post added with id- "+id, HttpStatus.CREATED);
    }

    @GetMapping("get-all")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
}
