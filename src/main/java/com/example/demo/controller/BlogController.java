package com.example.demo.controller;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/all")
    public List<Blog> getAllPost() {
        return blogRepository.findAll();
    }
    @PostMapping("/savePost")
    public Blog savePost(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @GetMapping("/new/{id}")
    public String getNewPost(@PathVariable String id) {
        return id;
    }
   @PutMapping("/updatePost")
    public Blog updatePost(@RequestBody Blog blog) {
        return  blogRepository.save(blog);
    }

    @DeleteMapping("/deletePost/{id}")
    public void deletePost(@PathVariable String id) {
        blogRepository.deleteById(Integer.valueOf(id));
    }
}
