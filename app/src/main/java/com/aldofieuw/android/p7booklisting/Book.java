package com.aldofieuw.android.p7booklisting;

/**
 * Created by aldof on 3/07/2017.
 */

public class Book {

    private String mTitle, mUrl, mSmallThumbnail, mAuthor;


    public Book(String mTitle, String mAuthor, String mUrl, String mSmallThumbnail) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mUrl = mUrl;
        this.mSmallThumbnail = mSmallThumbnail;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getSmallThumbnail() {
        return mSmallThumbnail;
    }
}
