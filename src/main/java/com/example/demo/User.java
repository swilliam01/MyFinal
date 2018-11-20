package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String login;
    private String following;
    private String followers;

//    private ArrayList<String> following_url;
//    private ArrayList<String> followers_url;

   // @ManyToMany
    //private ArrayList<Repos_url> repos_url;


    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



//    public ArrayList<Repos_url> getRepos_url() {
//        return repos_url;
//    }
//
//    public void setRepos_url(ArrayList<Repos_url> repos_url) {
//        this.repos_url = repos_url;
//    }

//    public ArrayList<String> getFollowing_url() {
//        return following_url;
//    }
//
//    public void setFollowing_url(ArrayList<String> following_url) {
//        this.following_url = following_url;
//    }
//
//    public ArrayList<String> getFollowers_url() {
//        return followers_url;
//    }
//
//    public void setFollowers_url(ArrayList<String> followers_url) {
//        this.followers_url = followers_url;
//    }



    public String getFollowing() {
        return followers;
    }
    public void setFollowing(String following) {
        this.following = following;
    }
    public void setFollowers(String followers) {
        this.followers = followers;
    }
    public String getFollowers() {
        return followers;
    }

    @Override
    public String toString(){
        return "User{id =  "+id+
                ",   Username  = "+login+
                ",   following  = "+following+
                ",   followers  = " +followers+
                /*"following:" +following_url+
                "pulls_url" +repos_url+*/"}\n";
//
    }
}
