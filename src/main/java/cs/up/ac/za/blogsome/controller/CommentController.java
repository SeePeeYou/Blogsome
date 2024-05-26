package cs.up.ac.za.blogsome.controller;

import blogsome.api.CommentApi;
import blogsome.model.Comments;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CommentController implements CommentApi {

  @Override
  public ResponseEntity<String> postComment(final Integer blogId, final Comments comments) {
    return ResponseEntity.status(HttpStatus.OK).body(new String());
  }

  @Override
  public ResponseEntity<List<Comments>> viewComment(final Integer blogId) {
    return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(new Comments()));
  }
}
