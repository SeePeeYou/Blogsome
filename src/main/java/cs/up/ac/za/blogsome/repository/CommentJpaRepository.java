package cs.up.ac.za.blogsome.repository;

import cs.up.ac.za.blogsome.model.CommentDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentJpaRepository extends JpaRepository<CommentDao,Long> {

}
