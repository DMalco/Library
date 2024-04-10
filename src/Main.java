// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Book b = new Book("Herman Melville", "Moby Dick", "1503280780", true);
        //Getters
        b.getAuthor();
        b.getTitle();
        b.getISBN();
        b.isOnLoan();

        //Set onLoan
        //b.setOnLoan();


    }
}