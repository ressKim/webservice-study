package study.webappservice.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.webappservice.web.domain.posts.Posts;
import study.webappservice.web.domain.posts.PostsRepository;
import study.webappservice.web.dto.PostUpdateRequestDto;
import study.webappservice.web.dto.PostsResponseDto;
import study.webappservice.web.dto.PostsSaveRequestDto;

import javax.persistence.Id;

@RequiredArgsConstructor
@Service
@Transactional
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    public Long update(Long id, PostUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 글이 없습니다. id = " + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 글이 없습니다. id=" + id));

        return new PostsResponseDto(posts);
    }


}
