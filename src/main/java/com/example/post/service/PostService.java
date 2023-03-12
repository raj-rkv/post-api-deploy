package com.example.post.service;

import com.example.post.dao.PostRepository;
import com.example.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public int addPost(Post postData)
    {
        Post post=postRepository.save(postData);
        return post.getPostId();
    }

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }
}
