package study.webappservice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import study.webappservice.service.posts.PostsService;
import study.webappservice.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@RestController
public class PostApiController {


    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
