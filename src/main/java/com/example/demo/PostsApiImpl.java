package com.example.demo;

import com.example.demo.generated.api.PostsApi;
import com.example.demo.generated.model.CreatePost;
import com.example.demo.generated.model.Post;
import com.example.demo.generated.model.PostListe;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class PostsApiImpl implements PostsApi {

    @Override
    public ResponseEntity<Post> createPost(String xAuthorId, CreatePost createPost) {
        if ("1234".equals(xAuthorId)) {
            Post post = new Post();
            post.setId(UUID.randomUUID().toString());
            post.setText(createPost.getText());
            post.setTags(createPost.getTags());

            return ResponseEntity.status(201).body(post);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<PostListe> getPosts(List<String> tags, List<String> users) {
        Post firstPost = new Post();
        firstPost.setId(UUID.randomUUID().toString());
        firstPost.setText("hello world");
        firstPost.setTags(Arrays.asList("#first", "#hello"));

        Post secondPost = new Post();
        secondPost.setId(UUID.randomUUID().toString());
        secondPost.setText("second post");

        PostListe list = new PostListe();
        list.setPosts(Arrays.asList(firstPost, secondPost));

        return ResponseEntity.ok(list);
    }
}
