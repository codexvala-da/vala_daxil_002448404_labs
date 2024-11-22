/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author harshalneelkamal
 */

import data.DataStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Q1 Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    public void getMaxLikesCommentPost() {
        DataStore data = DataStore.getInstance();
        Comment commentwithMaxLikes = null;
        
        for (Comment c : data.getComments().values()) {
            if(commentwithMaxLikes == null){
                commentwithMaxLikes = c;
            }
            if(c.getLikes() > commentwithMaxLikes.getLikes()){
                commentwithMaxLikes = c;
            }
        }
        int postId = commentwithMaxLikes.getPostId();
        
        System.out.println("Q2 Post with most likes per comments "+ data.getPosts().get(postId).getPostId());
    }
    
     public void getMostNumberOfCommentsOnPost(){
        DataStore dataStore = DataStore.getInstance();
        Post postWithMaxComment = null;
        
        for(Post p : dataStore.getPosts().values()){
            if(postWithMaxComment == null){
                postWithMaxComment = p;
            } if(p.getComments().size() > postWithMaxComment.getComments().size()){
                postWithMaxComment = p;
            }
        }
        
        System.out.println(" ");
        System.out.println("Q-3 - post with most numbers of comments: " +  postWithMaxComment.getPostId());     
    }

        public void getPassiveUsers(){
        DataStore dataStore = DataStore.getInstance();
        HashMap<Integer, Integer> postNumber = new HashMap<Integer, Integer>();
        
        for(Post p : dataStore.getPosts().values()){
            int userId = p.getUserId();
            if(postNumber.containsKey(userId)){
                postNumber.put(userId, postNumber.get(userId)+1);
            } else{
                postNumber.put(userId, 1);
            }
        }
        
        ArrayList<User> users = new ArrayList(dataStore.getUsers().values());
        Collections.sort(users, new UserMapComparator(postNumber));
        System.out.println(" ");
        System.out.println("Q4 - The following are top 5 least user with least posts on their social media");
        
        for(int i=0; i<5; i++){
            System.out.println(users.get(i)+", - post count: " + postNumber.get(users.get(i).getId()));
        } 
    }
        
    public void getPassiveCommentsUsers(){
        DataStore dataStore = DataStore.getInstance();
        HashMap<Integer, Integer> commentNumber = new HashMap<Integer, Integer>();
        
        for(Comment c : dataStore.getComments().values()){
            int userId = c.getUserId();
            if(commentNumber.containsKey(userId)){
                commentNumber.put(userId, commentNumber.get(userId)+1);
            } else{
                commentNumber.put(userId, 1);
            }
        }
        
        ArrayList<User> users = new ArrayList(dataStore.getUsers().values());
        Collections.sort(users, new UserMapComparator(commentNumber));
        System.out.println(" ");
        System.out.println("Q5 - The following are top 5 least user with least comments on their social media");
         
        for(int i=0; i<5; i++){
            System.out.println(users.get(i)+", - comment count: " + commentNumber.get(users.get(i).getId()));
        } 
    }
    

    public void getPassiveAndActiveOverallUser(){
        DataStore dataStore = DataStore.getInstance();
        HashMap<Integer, Integer> overAllNumber = new HashMap<Integer, Integer>();
        
         for(Comment c : dataStore.getComments().values()){
            int userId = c.getUserId();
            if(overAllNumber.containsKey(userId)){
                overAllNumber.put(userId, overAllNumber.get(userId)+1);
            } else{
                overAllNumber.put(userId, 1);
            }
        }
        
        for(Post p : dataStore.getPosts().values()){
            int userId = p.getUserId();
            if(overAllNumber.containsKey(userId)){
                overAllNumber.put(userId, overAllNumber.get(userId)+1);
            } else{
                overAllNumber.put(userId, 1);
            }
        }
        
        ArrayList<User> users = new ArrayList(dataStore.getUsers().values());
        
        Collections.sort(users, new UserMapComparator(overAllNumber));
        System.out.println(" ");
        System.out.println("Q6 - The following are top 5 overall passive users");
         
        for(int i=0; i<5; i++){
            System.out.println(users.get(i)+", - overall count: " + overAllNumber.get(users.get(i).getId()));
        } 
        
        System.out.println(" ");
        System.out.println("Q7 - The following are top 5 overall proactive users");
         
        for(int i=users.size()-1; i>users.size()-6; i--){
            System.out.println(users.get(i)+", - overall count: " + overAllNumber.get(users.get(i).getId()));
        } 
    }
}
