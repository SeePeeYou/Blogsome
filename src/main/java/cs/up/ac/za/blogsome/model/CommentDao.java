package cs.up.ac.za.blogsome.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "comments")
@Data
public class CommentDao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(columnDefinition = "TEXT")
  private String comment;

  @OneToMany
  private List<ReplyDao> replies;

  @ManyToOne
  private BlogDao blog;

  private Integer likes;

}
