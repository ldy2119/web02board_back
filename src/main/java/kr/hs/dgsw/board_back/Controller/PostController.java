package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping(value = "/api/board")
    public List board()
    {
        return postService.findAll();
    }


    @GetMapping(value = "/api/board/view/{id}")
    public Post findPostById(@PathVariable long id)
    {
        return postService.findById(id);
    }

    @PostMapping(value = "/api/addPost")
    public Long addPost(@RequestBody Post post)
    {
        return postService.add(post);
    }

    @PostMapping(value = "/api/addPostToHashMap")
    public int addPostToHashMap(@RequestBody Post post)
    {
        return postService.addWithHashmap(post);
    }

    @PutMapping(value = "/api/modifyPost")
    public int modifyPost(@RequestBody Post post)
    {
        return postService.modify(post);
    }

    @DeleteMapping(value = "/api/deletePost/{id}")
    public int deletePost(@PathVariable Long id)
    {
        return postService.deleteById(id);
    }
}
