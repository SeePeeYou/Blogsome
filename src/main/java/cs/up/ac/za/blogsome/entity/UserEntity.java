package cs.up.ac.za.blogsome.entity;

import java.util.List;
import lombok.Data;

@Data
public class UserEntity {

  private Long id;

  private String username;

  private Integer followers;

  private List<BlogEntity> blogs;
}
