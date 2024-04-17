import java.util.ArrayList;
/**
 *Class for library admin
 * @author DaveM
 * @version 10/04/24
 */

public class Library {
    private ArrayList<Book> books;

    private String Name;

    public Library(String aName)
    {
        books = new ArrayList<Book>();
        this.Name = aName;


    }

    /**
     * Allows user to add a book by passing its author, title and ISBN
     * @param aAuthor The Author of the book
     * @param aTitle The Title of the book
     * @param anISBN The ISBN of the book
     */
    //public void addBook(String aAuthor, String aTitle, String anISBN)
    //{
     //   Book a = new Book(aAuthor,aTitle,anISBN);
     //   this.books.add(a);
    //}

    /**
     * Allows user to add a book by passing a Book object
     * @param b
     */
    public void addBook(Book b)
    {
        this.books.add(b);
    }

    public void listAllBooks() {
        for (Book books : this.books) {
            System.out.println(books);
        }
    }

    private void getMatchingTitles()
    {

    }


}
