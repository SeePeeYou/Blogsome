//package cs.up.ac.za.blogsome.service.comment;
//
//import cs.up.ac.za.blogsome.entity.BlogEntity;
//import cs.up.ac.za.blogsome.entity.CommentEntity;
//import cs.up.ac.za.blogsome.model.BlogDao;
//import cs.up.ac.za.blogsome.model.CommentDao;
//import cs.up.ac.za.blogsome.model.UserDao;
//import cs.up.ac.za.blogsome.repository.BlogsJpaRepository;
//import cs.up.ac.za.blogsome.repository.CommentJpaRepository;
//import cs.up.ac.za.blogsome.utils.mapper.BlogMapper;
//import cs.up.ac.za.blogsome.utils.mapper.CommentMapper;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CommentServiceImpl implements CommentService {
//
//  CommentJpaRepository commentJpaRepository;
//  BlogsJpaRepository blogsJpaRepository;
//
//  BlogMapper blogMapper;
//
//  CommentMapper commentMapper;
//
//  @Autowired
//  public CommentServiceImpl(final CommentJpaRepository commentJpaRepository, final BlogsJpaRepository blogsJpaRepository,
//                            final BlogMapper blogMapper,
//                            final CommentMapper commentMapper) {
//    this.commentJpaRepository = commentJpaRepository;
//    this.blogsJpaRepository = blogsJpaRepository;
//    this.blogMapper = blogMapper;
//    this.commentMapper = commentMapper;
//  }
//
//  @Override
//  public String postComment(final CommentEntity comment) {
//    BlogDao blogDao = blogsJpaRepository.findById(comment.getBlog()).orElseThrow(NullPointerException::new);
//    CommentDao commentDao = commentMapper.entityToDao(comment);
//    commentDao.setBlog(blogDao);
//    commentJpaRepository.save(commentDao);
//    blogDao.getComments().add(commentDao);
//    blogsJpaRepository.save(blogDao);
//    return "Successfully persisted a new comment";
//  }
//
//  @Override
//  public List<BlogEntity> viewComment(final Integer blogId) {
//    return null;
//  }
//}
