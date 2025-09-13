import models.Book;
import services.LibraryService;
import services.UserService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();
        UserService userService = new UserService(libraryService);
        boolean exit = false;

        while(!exit){
            //Display menu option
            System.out.println("=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Add User.");
            System.out.println("6. Add Borrowed Books (by id).");
            System.out.println("7. Find Users (by id). ");
            System.out.println("8. Remove Book from user (borrow list).");
            System.out.println("9. Exit");
            System.out.println("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    // Prompt for book details, call libraryService.addBook(...)
                    System.out.println("Enter the name of the book: ");
                    String book_name = scan.nextLine();
                    System.out.println("Enter the author of the book: ");
                    String book_author = scan.nextLine();
                    libraryService.addBook(book_name, book_author);
                    
                    break;

                case 2:
                    // Call LibraryService.listBooks() and print them
                    System.out.println("=== List of Books ===");
                    for(Book book: libraryService.getAllBooks()){
                        System.out.println(book);
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter Book Id to search: ");
                    int searchId = scan.nextInt();
                    scan.nextLine();
                    Book foundBook = libraryService.getBookById(searchId);
                    if(foundBook != null ){
                        System.err.println("Book found: "+ foundBook);
                    }else{
                        System.err.println("No book found with ID: "+ searchId);
                    }
                    break;
                    
                case 4:
                    System.out.println("Enter title to search: ");
                    String titleQuery = scan.nextLine();
                    List<Book> matches = libraryService.searchBooksByTitle(titleQuery);
                    if(!matches.isEmpty()){
                        System.out.println("Books matching \"" + titleQuery +"\":");
                        for(Book b : matches){
                            System.out.println(b);
                        }
                    }else{
                        System.out.println("No books found with title containing: "+ titleQuery);
                    }
                    break;
                    
                case 5:
                    System.out.println("Enter Name: ");
                    String name = scan.nextLine();
                    userService.addUser(name);
                    break;
                    
                case 6:
                    System.out.println("Enter the users id: ");
                    int id = scan.nextInt();
                    System.out.println("Enter the id of the book: ");
                    int bookId = scan.nextInt();
                    scan.nextLine();
                    userService.borrowBookById(id, bookId);
                    break;
                    
                case 7:
                    System.out.println("Enter the user id: ");
                    int userId = scan.nextInt();
                    userService.displayUserById(userId);
                    break;
                    
                case 8:
                    System.out.println("Enter the user id: ");
                    int userRId = scan.nextInt();
                    System.out.println("Enter the books id: ");
                    int bookRId = scan.nextInt();
                    userService.removeBookbyId(userRId, bookRId);
                    break; 
                    
                case 9:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice,try again. ");
            }
        }
        scan.close();
 }   
}
