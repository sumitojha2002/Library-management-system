package services;

import models.Book;


import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books;
    private int nextId;

    public LibraryService(){
        books = new ArrayList<>();
        nextId = 1;
    }

    public void addBook(String title,String author){
        Book book = new Book(nextId, title, author, true);
        books.add(book);
        nextId++;
    }

    public Book getBookById(int id){
        for(Book book: books)
        {
            if(book.getId() == id)
            {
                return book;
            }
        }
        return null;
    }

    public List<Book> searchBooksByTitle(String title){
        List<Book> result = new ArrayList<>();
        for(Book book: books)
        {
            if(book.getTitle().toLowerCase().contains(title.toLowerCase()))
            {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getAllBooks(){
        //Return the list of books
        return books;
    }

}
