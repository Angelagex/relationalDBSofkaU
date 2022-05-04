package com.sofkaU.relationalDB.service;

import com.sofkaU.relationalDB.entity.Comment;
import com.sofkaU.relationalDB.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface postService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPost();
}
