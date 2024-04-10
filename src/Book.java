/**
 * A class containing information of Books
 * @author Dave
 * @version 14/04/24
 */

public class Book {
    private String author;
    private String title;
    private String ISBN;
    private boolean onLoan;


    /**
     * Constructor to create an object of the Book class
     *
     * @param aAuthor  the author of the book
     * @param aTitle   the title of the book

     */
    public Book(String aAuthor, String aTitle, String anISBN) {
        this.author = aAuthor;
        this.title = aTitle;
        this.ISBN = anISBN;
        this.onLoan = false;
    }

    /**
     * Getters
     **/
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isOnLoan()
    {

        return onLoan;
    }

    /**
     * Setters
     */
    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public String toString() {

        String availability;

        if(this.onLoan)
        {
            availability = "(On Loan)";
        }
        else
        {
            availability = "(Available)";
        }
        return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + " " + availability;
    }

    public void verifyISBN()
    {
        if(ISBN.length() !=13 || !Character.isDigit(0-9))
        {
            System.out.println("Invalid ISBN number");
        }
        else
        {
            System.out.println("This ISBN is valid");
        }

    }
}


