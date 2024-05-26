package cs.up.ac.za.blogsome.repository;

import cs.up.ac.za.blogsome.model.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersJpaRepository extends JpaRepository<UserDao, Long> {

}
