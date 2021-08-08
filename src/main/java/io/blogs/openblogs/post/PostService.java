package io.blogs.openblogs.post;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    private List<Post> postslist = new ArrayList<>(Arrays.asList(
            new Post("1", "Java basic", "This is a java post", "02 April 2021"),
            new Post("2", "Java advance", "This is a java advance post", "12 Mar 2021"),
            new Post("3", "Java streams", "This is a java streams post", "19 April 2021")
    ));

    public List<Post> getPosts(){
        return postslist;
    }

    public Post getPostById(String id){
        return postslist.stream().filter(post -> post.getId().equals(id)).findFirst().get();
    }

    public String addPost(Post newPost){
        postslist.add(newPost);
        return "Added successfully!";
    }

    public String updatePostById(String id, Post post) {
        for(int i=0; i< postslist.size(); i++){
            Post p = postslist.get(i);
            if(p.getId().equals(id)){
                postslist.set(i, post);
            }
        }
        return "Post updated successfully!";
    }

    public String deletePostById(String id) {
        postslist.removeIf(p -> p.getId().equals(id));
        return "Post deleted successfully!";
    }
}
