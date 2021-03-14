package study.webappservice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.webappservice.service.posts.PostsService;
import study.webappservice.web.dto.PostsUpdateRequestDto;
import study.webappservice.web.dto.PostsResponseDto;
import study.webappservice.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@RestController
public class PostApiController {


    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
