package cs.up.ac.za.blogsome.service.blog;

import blogsome.model.Blogs;

public interface BlogService {

  String postBlog(Blogs blog);

  Blogs getBlogById(Integer id);
}
