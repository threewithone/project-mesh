package com.boatofthree.entity;

public class Song {

    private long id;

    private String author;
    private String title;
    private int duration;
    private boolean isBlocked;

    //for JPA only
    public Song() {
    }

    public Song(long id, String author, String title, int duration) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
