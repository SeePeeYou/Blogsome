package cs.up.ac.za.blogsome.entity;

import java.util.List;
import lombok.Data;

@Data
public class BlogEntity {

  private Long id;

  private String post;

  private List<String> tags;

  private Long blogUser;

  private Integer likes;

  private List<CommentEntity> comments;

}
