package com.example.androidx.Models;

public class ProjectModel {
    int img;

    public ProjectModel(int img, String title, String desc, String link) {
        this.img = img;
        this.title = title;
        this.desc = desc;
        this.link = link;
    }

    String title;
    String desc;
    String link;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
