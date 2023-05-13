package com.glc;

import java.util.ArrayList;
import java.util.List;

public class ReadingList {
    Book book;
    int rating;
    String dateRead;

    static List<String> bookList = new ArrayList();

    public static List<String> getBook() {
        if (bookList.size() == 0) {
            return null;
        }
        return bookList;
    }

    public static void addBook(Book book, String dateRead, int rating) {
        String bookInfo = String.format("%s by %s, %d pages, %d, %s, %d", book.title, book.author, book.lenght,
                book.year, dateRead, rating);
        bookList.add(bookInfo);
    }

    public static void removeBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).contains(title)) {
                bookList.remove(i);
                i--;
            }
        }
    }

    public List<String> getBookByRating() {
        if (bookList.size() == 0) {
            return null;
        }
        return bookList;
    }

    public int numberRead() {
        return bookList.size();

    }

}
