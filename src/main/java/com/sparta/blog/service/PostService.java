package com.sparta.blog.service;

import com.sparta.blog.dto.PostRequestDto;
import com.sparta.blog.dto.PostResponseDto;
import com.sparta.blog.entity.Post;
import com.sparta.blog.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostResponseDto createPost(PostRequestDto requestDto) {
        // RequestDto -> Entity -> ResponseDto

        // RequestDto -> Entity
        Post post = new Post(requestDto);

        // DB 저장
        Post savePost = postRepository.save(post);

        // Entity -> ResponseDto
        PostResponseDto postResponseDto = new PostResponseDto(post);

        return postResponseDto;
    }

    public List<PostResponseDto> getPosts() {
        // DB 조회
        return postRepository.findAll().stream().map(PostResponseDto::new).toList();
    }

    public PostResponseDto getPost(Long id, PostRequestDto requestDto) {
        // 해당 포스트가 DB에 있는지 체크
        Post post = findPost(id);

        PostResponseDto postResponseDto =  new PostResponseDto(post);
        return postResponseDto;
    }

    @Transactional
    public Long updatePost(Long id, PostRequestDto requestDto) {
        // 해당 포스트가 DB에 있는지 체크
        Post post = findPost(id);

        if(validatePassword(post.getPassword(),requestDto.getPassword()) == true) {
            // 내용 수정
            post.update(requestDto);
        } else {
            System.out.println("비번이 틀립니다");
        }
        return id;
    }

    public Long deletePost(Long id, String password) {
        // 해당 포스트가 DB에 있는지 체크
        Post post = findPost(id);

        if(validatePassword(post.getPassword(),password) == true) {
            // 내용 삭제
            postRepository.delete(post);
        } else {
            System.out.println("비번이 틀립니다");
        }
        return id;
    }

    private Boolean validatePassword(String password1, String password2){
        if(password1.equals(password2)) {
            return true;
        } else {
            return false;
        }
    }
    private Post findPost(Long id) {
        // Optional Check
        return postRepository.findById(id).orElseThrow( () ->
                new IllegalArgumentException()
        );
    }
}
