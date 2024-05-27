package cs.up.ac.za.blogsome.controller;

import blogsome.api.ReplyApi;
import blogsome.model.Comments;
import blogsome.model.Reply;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ReplyController implements ReplyApi {

  @Override
  public ResponseEntity<String> postReply(final Integer commentId, final Reply reply) {
    return ReplyApi.super.postReply(commentId, reply);
  }

  @Override
  public ResponseEntity<List<Comments>> viewReply(final Integer commentId) {
    return ResponseEntity.status(HttpStatus.OK).body(List.of(new Comments()));
  }
}
