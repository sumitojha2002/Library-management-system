package services;

import models.Book;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    Book book;
    LibraryService libraryService;
    private List<User> users;
    private int nextId;

    public UserService(LibraryService libraryService){
        this.libraryService = libraryService;
        users = new ArrayList<>();
        nextId = 1;
    }

    public void addUser(String name){
        User user = new User(nextId++, name);
        users.add(user);
    }

    public User getUserById(int userId){
        for(User user:users)
        {
            if(user.getId() == userId)
            {
                return user;
            }
        }
            return null;
    }

      public void displayUserById(int userId){
      User user = getUserById(userId);
      if(user== null)
      {
        System.out.println("No user found!");
      }else{
        System.out.println(user);
      }
    }

    
    public User borrowBookById(int userId,int bookId){
      User user = getUserById(userId);
    
      if(user == null){
        System.out.println("User not found!");
        return null;
      }

      Book book = libraryService.getBookById(bookId);
      
      if(book== null){
        System.out.println("Book not found!");
        return null;
      }
      user.borrowBook(book);
      return user;
    }

    public void removeBookbyId(int userId,int bookId){
      User user = getUserById(userId);
        
      if(user == null){
        System.out.println("User not found!");
      }

      Book book = libraryService.getBookById(bookId);

      if(book== null){
        System.out.println("Book not found!");
      }
      book.setAvailable(true);
      user.removeBook(book);
      System.out.println("Book returned successfully by " + user.getName());
    }
}
