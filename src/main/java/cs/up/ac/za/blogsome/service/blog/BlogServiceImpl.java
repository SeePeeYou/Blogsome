//package cs.up.ac.za.blogsome.service.blog;
//
//import blogsome.model.Blogs;
//import cs.up.ac.za.blogsome.entity.BlogEntity;
//import cs.up.ac.za.blogsome.model.BlogDao;
//import cs.up.ac.za.blogsome.model.UserDao;
//import cs.up.ac.za.blogsome.repository.BlogsJpaRepository;
//import cs.up.ac.za.blogsome.repository.UsersJpaRepository;
//import cs.up.ac.za.blogsome.utils.mapper.BlogMapper;
//import cs.up.ac.za.blogsome.utils.mapper.UserMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class BlogServiceImpl implements BlogService {
//
//  BlogsJpaRepository blogsJpaRepository;
//  UsersJpaRepository usersJpaRepository;
//
//  BlogMapper blogMapper;
//
//  UserMapper userMapper;
//
//  @Autowired
//  public BlogServiceImpl(final BlogsJpaRepository blogsJpaRepository, final UsersJpaRepository usersJpaRepository,
//                         final BlogMapper blogMapper,
//                         final UserMapper userMapper) {
//    this.blogsJpaRepository = blogsJpaRepository;
//    this.usersJpaRepository = usersJpaRepository;
//    this.blogMapper = blogMapper;
//    this.userMapper = userMapper;
//  }
//
//  @Override
//  public String postBlog(final Blogs blog) {
//   // UserDao userDao = usersJpaRepository.findById(blog.get).orElseThrow(NullPointerException::new);
//   // BlogDao blogDao = blogMapper.dtoToDao(blog);
// //   blogDao.setBlogUser(userDao);
//    blogsJpaRepository.save(blogDao);
//   // userDao.getBlogs().add(blogDao);
//   // usersJpaRepository.save(userDao);
//    return "Successfully persisted a new Blog";
//  }
//
//  @Override
//  public Blogs getBlogById(final Integer id) {
////    BlogDao blogDao = blogsJpaRepository.findById(id.longValue()).orElseThrow(NullPointerException::new);
////    log.info("errors***************************************************");
////    return blogMapper.daoToDto(blogDao);
//    return new Blogs();
//  }
//}
