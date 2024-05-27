package cs.up.ac.za.blogsome.controller;

import blogsome.api.BlogApi;
import blogsome.model.Blogs;
import cs.up.ac.za.blogsome.SomeClass;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BlogController implements BlogApi {

  private SomeClass someClass;
@Autowired
  public BlogController(final SomeClass someClass) {
    this.someClass = someClass;
  }

  @Override
  public ResponseEntity<String> blogPost(final Blogs blogs) {
    someClass.addBlog(blogs);
    return ResponseEntity.status(HttpStatus.OK).body("");
  }

  @Override
  public ResponseEntity<Blogs> getBlogById(final Integer blogId) {

    return ResponseEntity.status(HttpStatus.OK).body(someClass.getBlogById(blogId));
  }
}
