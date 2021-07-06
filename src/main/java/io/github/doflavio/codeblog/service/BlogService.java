package io.github.doflavio.codeblog.service;

import io.github.doflavio.codeblog.model.Post;

import java.util.List;

public interface BlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
