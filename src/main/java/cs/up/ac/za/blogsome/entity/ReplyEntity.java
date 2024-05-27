package cs.up.ac.za.blogsome.entity;

import lombok.Data;

@Data
public class ReplyEntity {

  private Long id;

  private String replyComment;

  private Long comment;

  private Integer likes;
}
