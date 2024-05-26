package cs.up.ac.za.blogsome.repository;

import cs.up.ac.za.blogsome.model.BlogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogsJpaRepository extends JpaRepository<BlogDao, Long> {

}
