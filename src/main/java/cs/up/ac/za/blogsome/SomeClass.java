package cs.up.ac.za.blogsome;

import blogsome.model.Blogs;
import blogsome.model.Comments;
import blogsome.model.Reply;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public  class SomeClass {

  public List<Blogs> blogsArrayList = new ArrayList<>();
  public List<Comments> commentsArrayList = new ArrayList<>();
  public List<Reply> replyList =new ArrayList<>();
  int id = 1;

  public void addBlog(Blogs blog) {

    blogsArrayList.add(blog);
  }
  public void addComment(Comments comments, Integer blogId) {
    commentsArrayList.add(comments);
    blogsArrayList.get(blogId).setComments(commentsArrayList);
  }


  public Blogs getBlogById(final Integer blogId) {
    return blogsArrayList.get(blogId - 1);
  }
  public List<Comments> viewComment(final Integer blogId){
    return blogsArrayList.get(blogId-1).getComments();
  }
  public Blogs likeBlogById(final Integer blogId){

    return blogsArrayList.get(blogId-1).likes(1L);
  }
  public Comments likeCommentById(final Integer blogId){

    return commentsArrayList.get(blogId-1).likes(1L);
  }

  public  void postComment(final Integer blogId, final Comments comments){

  }
}
