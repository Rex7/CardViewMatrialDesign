package com.example.regis.cardviewmatrialdesign;

/**
 * Created by Regis on 22-01-2018.
 */

public class AlbumModel {
    private String title, count;
    private int imgOfSong;

    public AlbumModel(String title, String count, int imgOfSong) {
        this.title = title;
        this.count = count;
        this.imgOfSong = imgOfSong;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getImgOfSong() {
        return imgOfSong;
    }

    public void setImgOfSong(int imgOfSong) {
        this.imgOfSong = imgOfSong;
    }
}
