package cs.up.ac.za.blogsome.service.comment;

import cs.up.ac.za.blogsome.entity.BlogEntity;
import cs.up.ac.za.blogsome.entity.CommentEntity;
import java.util.List;

public interface CommentService {

  String postComment(CommentEntity comment);

  List<BlogEntity> viewComment(Integer blogId);
}
