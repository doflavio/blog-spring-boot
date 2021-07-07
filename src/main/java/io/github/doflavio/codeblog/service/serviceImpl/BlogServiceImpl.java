package io.github.doflavio.codeblog.service.serviceImpl;

import io.github.doflavio.codeblog.model.Post;
import io.github.doflavio.codeblog.repository.BlogRepository;
import io.github.doflavio.codeblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Post> findAll() {
        //return blogRepository.findAll(sortByIdAsc());
        return blogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }

    private Sort sortByIdAsc() {
        //return new Sort(Sort.Direction.DESC, "id");
        return null;
    }
}
