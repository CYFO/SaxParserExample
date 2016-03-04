package com.codeyourfaceoff;

import java.util.ArrayList;

/**
 * Created by john on 3/4/16.
 */
public class Catalog {
    private ArrayList<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void push(Book b) {
        books.add(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book b : books) {
            sb.append(b.toString());
        }
        return sb.toString();
    }
}
