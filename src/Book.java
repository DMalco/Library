/**
 * A class containing information of Books
 * @author Dave
 * @version 14/04/24
 */

public class Book
{
    private String author;
    private String title;
    private String ISBN;
    private boolean onLoan;


/**
 * Constructor to create an object of the Book class
 * @param aAuthor the author of the book
 * @param aTitle the title of the book
 * @param anISBN  the ISBN of the book
 * @param isOnLoan whether the book is currently out on oan
 */
    public Book(String aAuthor, String aTitle, String anISBN, boolean isOnLoan)
    {
        this.author = aAuthor;
        this.title = aTitle;
        this.ISBN = anISBN;
        this.onLoan = false;
    }

    /**Getters
     *
     **/
    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public boolean isOnLoan()
    {
        return onLoan;
    }

    /**Setters
     */
    public void setOnLoan(boolean onLoan)
    {
         this.onLoan = onLoan;
    }

    public String toString()
    {
        return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + this.isOnLoan();
    }
}

