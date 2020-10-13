package LibraryInterface;

public class Book {

    private String Title;
    private String Author;
    boolean isavailable;


    Book(String Title, String Author) {
        this.Title = Title;
        this.Author = Author;
    }

    String getTitle() {
        return Title;
    }

    String getAuthor() {
        return Author;
    }
}

class Patron {

    private String Name;

    Patron(String Name) {
        this.Name = Name;
    }

    String getName() {
        return Name;
    }


    }
