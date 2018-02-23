import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean finnishedSwitchCase = false;

        LiteratureRegistry litReg = new LiteratureRegistry();

        litReg.addBook(new Book("Peter V. Brett", "The Painted Man", "The Demon Cycle", 1,
                "Fantasy", "Del Rey Books", 2010, "", 5));

        litReg.addBook(new Book("Peter V. Brett", "The Desert Spear", "The Demon Cycle", 2,
                "Fantasy", "Del Rey Books", 2011, "", 5));

        litReg.addBook(new Book("Peter V. Brett", "The Daylight War", "The Demon Cycle", 3,
                "Fantasy", "Del Rey Books", 2012, "", 5));

        litReg.addBook(new Book("Peter V. Brett", "The Skull Throne", "The Demon Cycle", 4,
                "Fantasy", "Del Rey Books", 2013, "", 5));

        litReg.addBook(new Book("Peter V. Brett", "The Core", "The Demon Cycle", 5,
                "Fantasy", "Del Rey Books", 2014, "", 5));

        litReg.addBook(new Book("Alibaba", "Jallabais", "Biography", "Jaham Books",
                2014, "", 5));

        litReg.addBook(new Book("J. R. R. Tolkien", "The Fellowship Of The Ring", "The Lord of the Rings", 1,
                "Fantasy", "Allen & Unwin", 1954, "", 10));

        litReg.addBook(new Book("J. R. R. Tolkien", "The Fellowship Of The Ring", "The Lord of the Rings", 1,
                "Fantasy", "Allen & Unwin", 1954, "", 10));

        litReg.addBook(new Book("J. R. R. Tolkien", "The Two Towers", "The Lord of the Rings", 2,
                "Fantasy", "Allen & Unwin", 1954, "", 10));

        litReg.addBook(new Book("J. R. R. Tolkien", "The Return of the King", "The Lord of the Rings", 3,
                "Fantasy", "Allen & Unwin", 1955, "", 10));


        ArrayList<Book> bookCart = new ArrayList<>();
        loop:
        while (!finnishedSwitchCase) {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            System.out.println("1. Search for book");
            System.out.println("2. Search for periodical");
            System.out.println("2. Proceed to checkout");
            System.out.println("3. Show cart");
            System.out.println("4. Quit");

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                continue loop;
            }

            switch (choice) {


                case 1:
                    ArrayList<Book> foundBooks = new ArrayList<>();
                    System.out.println("Type in search word");
                    try {
                        foundBooks = litReg.SearchKeyWord(scanner.next());
                        for (int i = 0; i < foundBooks.size(); i++) {
                            System.out.println("index = " + i);
                            foundBooks.get(i).printDetails();
                            System.out.println();

                        }
                    } catch (Exception e) {
                        continue loop;
                    }
                    int choiceTwo = 0;
                    if (foundBooks.size() > 0) {
                        while (true) {
                            Scanner scanner2 = new Scanner(System.in);
                            System.out.println("1. Add book to cart");
                            System.out.println("2. Show cart");
                            System.out.println("3. Return");
                            try {
                                choiceTwo = scanner2.nextInt();

                            } catch (Exception e) {
                                choiceTwo = 0;
                            }

                            switch (choiceTwo) {

                                case 1:
                                    System.out.println("Select book by Index");
                                    try {
                                        bookCart.add(foundBooks.get(scanner2.nextInt()));
                                    } catch (Exception e) {
                                        System.out.println("invaid input, try again");
                                    }

                                    break;


                                case 2:
                                    System.out.println("Books in you cart");
                                    litReg.printBooks(bookCart);
                                    break;

                                case 3:
                                    continue loop;


                                default:
                                    System.out.println("Invalid input");
                                    break;
                            }

                        }
                    } else {
                        System.out.println("No books found in registry");
                    }
                    break;

                default:
                    System.out.println("Invalid input1");
                    System.out.println(choice);

                    break;
            }
        }
    }
}