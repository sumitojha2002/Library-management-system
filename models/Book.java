package models;

public class Book {
    // Fields
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    
    // Constructor

    public Book(int id,String title, String author,boolean isAvailable){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Getters/Setters

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

   public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // toString()
    @Override
    public String toString(){
         return "[" + id + "] " + title + " by " + author + " — " + (isAvailable ? "Available" : "Borrowed");
    }
    // Optional: equals() and hashcode()
    
}
