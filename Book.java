package com.antstep.library.entity;

public class Book extends Print{
    private String author;
    private double ISBN;
    private  String genre;

    public String getAuthor() {
        return author;
    }

    public double getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String genre) {
        this.ISBN = ISBN;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
