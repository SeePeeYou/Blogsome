package cs.up.ac.za.blogsome.controller;

import blogsome.api.LikeApi;
import blogsome.model.Blogs;
import blogsome.model.Comments;
import blogsome.model.Reply;
import cs.up.ac.za.blogsome.SomeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LikesController implements LikeApi {
@Autowired
SomeClass someClass;
  @Override
  public ResponseEntity<Blogs> updateBlogLike(final Integer blogId) {
    return ResponseEntity.status(HttpStatus.OK).body(someClass.likeBlogById(blogId));
  }

  @Override
  public ResponseEntity<Comments> updateCommentLike(final Integer commentId) {
    return ResponseEntity.status(HttpStatus.OK).body(someClass.likeCommentById(commentId));
  }

  @Override
  public ResponseEntity<Reply> updateReplyLike(final Integer replyId) {
    return ResponseEntity.status(HttpStatus.OK).body(new Reply());
  }
}
