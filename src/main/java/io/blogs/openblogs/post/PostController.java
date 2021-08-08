package io.blogs.openblogs.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getAllPosts(@PathVariable String id){
        return postService.getPostById(id);
    }

    @PostMapping("/posts")
    public String addPost(@RequestBody Post post){
        return postService.addPost(post);
    }

    @PutMapping("/posts/{id}")
    public String updatePost(@RequestBody Post post, @PathVariable String id){
        return postService.updatePostById(id, post);
    }

    @DeleteMapping("/posts/{id}")
    public String deletePost(@PathVariable String id){
        return postService.deletePostById(id);
    }
}
