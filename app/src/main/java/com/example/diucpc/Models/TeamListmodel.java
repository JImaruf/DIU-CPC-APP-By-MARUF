package com.example.diucpc.Models;

public class TeamListmodel {

    String Name,Post;
    int profile;

    public TeamListmodel(int profile, String name, String post) {
        this.profile = profile;
        Name = name;
        Post = post;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }
}
