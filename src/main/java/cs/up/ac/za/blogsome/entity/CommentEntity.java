package cs.up.ac.za.blogsome.entity;

import java.util.List;
import lombok.Data;

@Data
public class CommentEntity {

  private Long id;

  private String comment;

  private List<ReplyEntity> replies;

  private Long blog;

  private Integer likes;
}
