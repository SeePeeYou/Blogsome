package cs.up.ac.za.blogsome.repository;

import cs.up.ac.za.blogsome.model.ReplyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyJpaRepository extends JpaRepository<ReplyDao, Long> {

}
