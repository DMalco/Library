/**
 * Provides a user interface for the library application
 */
public class UserInterface
{
    public Library library;
    private InputReader reader;

    public UserInterface()
    {
        reader = new InputReader();
        library = new Library("SERC Bangor LRC");
    }

    /**
     * Shows the Main Menu until the user chooses to quit
     */
    public void showMainMenu() {
        boolean quit = false;

        while (quit == false)// while (!quit)
        {
            System.out.println("Please choose option:");
            System.out.println("1. Add Book");
            System.out.println("2. List All Books");
            System.out.println("0. Exit Application");

            String userInput = reader.getInput();

            switch (userInput) {
                case "1":
                    this.addBook();
                    break;
                case "2":
                    this.listBooks();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("Sorry, that is not a valid choice, please try again:\n");
                    break;

            }

        }

    }

    /**
     * Allows a user to add a book to the library
     */
    public void addBook() {
        System.out.println("Please enter the Author: ");
        String author = reader.getInput();

        System.out.println("Please enter the Title: ");
        String title = reader.getInput();

        System.out.println("Please enter the ISBN: ");
        String ISBN = reader.getInput();

        Book b = new Book(author, title, ISBN);
        library.addBook(b);

        System.out.println("New book added - " + title + "\n\n");
    }

    public void listBooks()
    {
        this.library.listAllBooks();
        System.out.println();
    }

}

