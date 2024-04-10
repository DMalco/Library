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

    public void addBook(String aAuthor, String aTitle, String anISBN)
    {
        Book a = new Book(aAuthor,aTitle,anISBN);
        this.books.add(a);
    }

    public void listAllBooks()
    {
        for(Book books : this.books)
        {
            System.out.println(books);
        }
    }

    private void getMatchingTitles()
    {

    }


}
