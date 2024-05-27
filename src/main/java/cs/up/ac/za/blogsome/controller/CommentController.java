package cs.up.ac.za.blogsome.controller;

import blogsome.api.CommentApi;
import blogsome.model.Comments;
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
public class CommentController implements CommentApi {

  @Autowired
  SomeClass someClass;
  @Override
  public ResponseEntity<String> postComment(final Integer blogId, final Comments comments) {
    someClass.postComment(blogId,comments);
    return ResponseEntity.status(HttpStatus.OK).body("added comment to the blog");
  }

  @Override
  public ResponseEntity<List<Comments>> viewComment(final Integer blogId) {
    return ResponseEntity.status(HttpStatus.OK).body(someClass.getBlogById(blogId).getComments());
  }
}
