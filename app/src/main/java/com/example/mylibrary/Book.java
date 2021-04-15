package com.example.mylibrary;

public class Book {
    private long id;
    private String name;
    private String author;
    private int pages;
    private String imageUrl;
    private String shortDec;
    private String longDec;

    public Book(long id, String name, String author, int pages, String imageUrl, String shortDec, String longDec) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.imageUrl = imageUrl;
        this.shortDec = shortDec;
        this.longDec = longDec;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShortDec() {
        return shortDec;
    }

    public void setShortDec(String shortDec) {
        this.shortDec = shortDec;
    }

    public String getLongDec() {
        return longDec;
    }

    public void setLongDec(String longDec) {
        this.longDec = longDec;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", imageUrl='" + imageUrl + '\'' +
                ", shortDec='" + shortDec + '\'' +
                ", longDec='" + longDec + '\'' +
                '}';
    }
}