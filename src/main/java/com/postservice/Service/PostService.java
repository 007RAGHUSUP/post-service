package com.postservice.Service;

import com.postservice.Model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public String deleteById(String postId) {
        this.postRepo.deleteById(postId);
        return "Post id " + postId + " Successfully deleted";

        public PostModel updatePost(PostModel postModel, String postId){

            postModel.setCreatedAt(postRepo.findById(postId).get().getCreatedAt());
            postModel.setUpdatedAt(LocalDateTime.now());
            return this.postRepo.save(postModel);

            public PostModel findById (String postId){
                return this.postRepo.findById(postId).get();

                public PostModel savePost (PostModel postModel){
                    postModel.setCreatedAt(LocalDateTime.now());
                    postModel.setUpdatedAt(null);
                    return postRepo.save(postModel);
                }

                public List<PostModel> showAll () {
                    return postRepo.findAll();
                }
            }
        }
    }

    public Object updatePost(PostModel postModel, String postId) {
    }
}