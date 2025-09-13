# Library Management System <img width="225" height="225" alt="download" src="https://github.com/user-attachments/assets/b7065773-74a3-4456-a91a-f0c02cf0d5b5" />


A **small-scale Java project** that simulates a library management system using **Object-Oriented Programming (OOP)** concepts and **Java Collections**.  
This project allows users to manage books and library members, including adding, listing, searching, borrowing, and returning books — all through a simple console-based interface.

---

## Features

### Book Management
- Add new books with title and author.
- List all books in the library.
- Search books by ID or title.

### User Management
- Add library users with unique IDs.
- Display user details along with borrowed books.

### Borrowing & Returning Books
- Users can borrow available books.
- Users can return borrowed books.
- Book availability is tracked automatically.

### Console Menu Interface
- Easy-to-use menu-driven system for interacting with the library.

---

## Technologies Used
- **Java** – Core programming language.
- **OOP Concepts** – Classes, Objects, Encapsulation, Methods.
- **Collections Framework** – `ArrayList` for storing books and users.
- **Console I/O** – `Scanner` for user input.

---

## Project Structure
```
Library-Management-System/
├─ models/
│  ├─ Book.java
│  └─ User.java
├─ services/
│  ├─ LibraryService.java
│  └─ UserService.java
└─ Main.java
```


- **models**: Contains the data models (`Book` and `User`).  
- **services**: Contains business logic for handling books and users.  
- **Main.java**: Entry point with a menu-driven interface.  

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/sumitojha2002/Library-management-system.git
```

2. Navigate to the project folder and compile the code:

   javac models/*.java services/*.java Main.java

3. Run the program:
   java Main

4. Follow the on-screen menu to add books, add users, borrow/return books, and search.

Future Improvements

- Save data persistently (file or database) so data is not lost on exit.
- Improve input validation for better user experience.
- Add advanced features like overdue tracking, categories, or multiple copies of books.
- GUI interface using JavaFX or Swing.
