package com.example.recyclerviewanimated;

public class ReviewItem {

    private String Title,Content,Date;
    private int userImg;

    public ReviewItem(String s) {

    }

    public ReviewItem(String title, String content, String date, int userImg) {
        Title = title;
        Content = content;
        Date = date;
        this.userImg = userImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }
}
