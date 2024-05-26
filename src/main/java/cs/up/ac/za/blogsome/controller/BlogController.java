package cs.up.ac.za.blogsome.controller;

import blogsome.api.BlogApi;
import blogsome.model.Blogs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BlogController implements BlogApi {

  @Override
  public ResponseEntity<String> blogPost(final Blogs blogs) {
    return  ResponseEntity.status(HttpStatus.OK).body(new String());
  }

  @Override
  public ResponseEntity<Blogs> getBlogById(final Integer blogId) {
    return  ResponseEntity.status(HttpStatus.OK).body(new Blogs());
  }
}
