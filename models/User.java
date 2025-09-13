package models;

import java.util.List;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(int id,String name){
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book)
    {
        if(book != null)
        {
            book.setAvailable(false);
            borrowedBooks.add(book);
        }
    }

    public void removeBook(Book book)
    {
        book.setAvailable(true);
        borrowedBooks.remove(book);
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public String toString(){
          return "User ID: " + id + ", Name: " + name + ", Borrowed Books: " + borrowedBooks.size()+"Borrowed Books: "+ borrowedBooks;
    }

}
