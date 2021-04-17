package com.example.demo;

import com.example.demo.generated.api.AuthorsApi;
import com.example.demo.generated.model.Author;
import com.example.demo.generated.model.AuthorList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorsApiImpl implements AuthorsApi {

    @Override
    public ResponseEntity<Author> createAuthor(Author author) {
        return null;
    }

    @Override
    public ResponseEntity<Author> getAuthorById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<AuthorList> getAuthors() {
        return null;
    }
}
