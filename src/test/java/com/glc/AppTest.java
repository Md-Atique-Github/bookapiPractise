package com.glc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getBookTest() {

        // Setup
        List<String> list = ReadingList.bookList;
        list.clear();

        // Execute
        ReadingList myList = new ReadingList();
        List<String> books = myList.getBook();
        // Assert
        assertEquals(null, books);
    }

    @Test
    public void addFirstBookTest() {
        // Setup
        List<String> list = ReadingList.bookList;
        list.clear();
        Book book = new Book("justoju ka safr", "zeeshan usmai", 400, 2000);
        ReadingList.addBook(book, "21 march", 5);
        // Execute
        ReadingList myList = new ReadingList();
        int firstbook = myList.numberRead();
        // Assert
        assertEquals(1, firstbook);
    }

    @Test
    public void addAdditionalBooksTest() {
        // Setup
        List<String> list = ReadingList.bookList;
        list.clear();
        Book book1 = new Book("justoju ka safr", "zeeshan usmai", 400, 2000);
        ReadingList.addBook(book1, "21 march", 5);
        Book book2 = new Book("Calculus", "Howard Anton", 400, 2000);
        ReadingList.addBook(book2, "23 march", 5);
        // Execute
        ReadingList myList = new ReadingList();
        int firstbook = myList.numberRead();
        // Assert
        assertEquals(2, firstbook);
    }

    @Test
    public void removeBookTest() {
        // Setup
        List<String> list = ReadingList.bookList;
        list.clear();
        Book book1 = new Book("justoju ka safr", "zeeshan usmai", 400, 2000);
        ReadingList.addBook(book1, "21 march", 5);
        Book book2 = new Book("Calculus", "Howard Anton", 400, 2000);
        ReadingList.addBook(book2, "23 march", 5);
        String title = "justoju ka safr";
        // execute
        ReadingList myList = new ReadingList();
        ReadingList.removeBook(title);
        List<String> remaingBooks = ReadingList.getBook();

        List<String> book22 = new ArrayList<>();
        book22.add("Calculus by Howard Anton, 400 pages, 2000, 23 march, 5");

        // assert
        assertEquals(book22, remaingBooks);

    }

    @Test
    public void getAddedBooks() {
        // Setup
        List<String> list = ReadingList.bookList;
        list.clear();
        Book book2 = new Book("Calculus", "Howard Anton", 400, 2000);
        ReadingList.addBook(book2, "23 march", 5);
        // Execute
        ReadingList myList = new ReadingList();
        List<String> firstbook = myList.getBook();
        // Assert
        List<String> list22 = new ArrayList<>();
        list22.add("Calculus by Howard Anton, 400 pages, 2000, 23 march, 5");

        assertEquals(list22, firstbook);
    }

    @Test
    public void getBooksByRatingTest() {
        // setup
        List<String> list = ReadingList.bookList;
        list.clear();
        Book book1 = new Book("Calculus", "Howard Anton", 400, 2000);
        ReadingList.addBook(book1, "23 march", 5);
        // execute
        ReadingList myList = new ReadingList();
        List<String> recieveBooks = myList.getBookByRating();
        // assert
        List<String> arr = new ArrayList<>();
        arr.add("Calculus by Howard Anton, 400 pages, 2000, 23 march, 5");
        assertEquals(arr, recieveBooks);
    }

}
