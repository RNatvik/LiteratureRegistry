import java.util.ArrayList;

/**
 * A class for storing, manipulating and accessing lists of Books and Periodicals
 *
 * @author Ruben Natvik <r_bn-95@hotmail.com>
 * Marcus Olai Grindvik <marcusgrindvik@gmail.com>
 * Vebjørn Wille
 * @version v1.0
 * @since v1.0
 */
public class LiteratureRegistry {

    private ArrayList<Book> books;
    private ArrayList<Periodical> periodicals;

    /**
     * Constructor for a new Literature Registry
     */
    public LiteratureRegistry() {
        this.books = new ArrayList<>();
        this.periodicals = new ArrayList<>();
    }

    /**
     * Gets all Books in registry
     *
     * @return all Books as ArrayList
     */
    public ArrayList<Book> getBooks() {
        return this.books;
    }

    /**
     * Gets all Periodicals in registry
     *
     * @return all Periodicals as ArrayList
     */
    public ArrayList<Periodical> getPeriodicals() { return this.periodicals;
    }

    /**
     * Add  book to registry, if the book is not in the registry already.
     * If the book is already registered, adds quantity.
     *
     * @param book the Book to add.
     */
    public void addBook(Book book) {
        boolean notInRegistry = true;
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(book.getTitle()) && this.books.get(i).getAuthor().equals(book.getAuthor()) && this.books.get(i).getEdition().equals(book.getEdition())) {
                notInRegistry = false;
                this.books.get(i).increaseQuantity(book.getQuantity());
            }
        }
        if (notInRegistry) {
            this.books.add(book);
        }
    }

    public ArrayList<Book> SearchKeyWord(String Keyword) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor() != null) {
                if (book.getAuthor().toLowerCase().contains(Keyword.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
            if (book.getTitle() != null) {
                if (book.getTitle().toLowerCase().contains(Keyword.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
            if (book.getSeriesName() != null) {
                if (book.getSeriesName().toLowerCase().contains(Keyword.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
            if (book.getGenre() != null) {
                if (book.getGenre().toLowerCase().contains(Keyword.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
            if (book.getPublisher() != null) {
                if (book.getPublisher().toLowerCase().contains(Keyword.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
            if (book.getEdition() != null) {
                if (book.getEdition().toLowerCase().contains(Keyword.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;

    }

    /**
     * Search for books, by params that is used.
     *
     * @param author     Takes in the book`s Author
     * @param title      Takes in the book`s Title
     * @param seriesName Takes in the book`s Series Name
     * @param genre      Takes in the book`s Genre
     * @param publisher  Takes in the book`s publisher
     * @param edition    Takes in the book`s edition
     * @return Found books, by the params that is search fore.
     */
    public ArrayList<Book> search(String author, String title, String seriesName, String genre, String publisher, String edition) {
        boolean SearchByAuthor;
        boolean SearchByTitle;
        boolean SearchBySeries;
        boolean SearchByGenre;
        boolean SearchByPublisher;
        boolean SearchByEdition;

        SearchByAuthor = !author.toLowerCase().equals("");
        SearchByTitle = !title.toLowerCase().equals("");
        SearchBySeries = !seriesName.toLowerCase().equals("");
        SearchByGenre = !genre.toLowerCase().equals("");

        SearchByPublisher = !publisher.toLowerCase().equals("");
        SearchByEdition = !edition.toLowerCase().equals("");

        ArrayList<Book> foundbooks = new ArrayList<>();
        for (Book book : books) {
            if (SearchByAuthor) {
                if (book.getAuthor() != null) {
                    if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                        foundbooks.add(book);


                    }
                }
            }
            if (SearchByTitle) {
                if (book.getTitle() != null) {
                    if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                        foundbooks.add(book);

                    }
                }

            }
            if (SearchBySeries) {
                if (book.getSeriesName() != null) {
                    if (book.getSeriesName().toLowerCase().contains(seriesName.toLowerCase())) {
                        foundbooks.add(book);
                    }
                }
            }
            if (SearchByGenre) {
                if (book.getGenre() != null) {
                    if (book.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                        foundbooks.add(book);
                    }
                }
            }
            if (SearchByPublisher) {
                if (book.getPublisher() != null) {
                    if (book.getPublisher().toLowerCase().contains(publisher.toLowerCase())) {
                        foundbooks.add(book);
                    }
                }
            }
            if (SearchByEdition) {
                if (book.getEdition() != null) {
                    if (book.getEdition().toLowerCase().contains(edition.toLowerCase())) {
                        foundbooks.add(book);
                    }
                }
            }
        }
        return foundbooks;


    }

    /**
     * Removes a book from the registry
     *
     * @param authorOrTitle Takes in author or title as string
     */
    public void removeBook(String authorOrTitle) {
        for (int index = 0; index < this.books.size(); index++) {
            if (this.books.get(index).getTitle().equals(authorOrTitle) || this.books.get(index).getAuthor().equals(authorOrTitle)) {
                this.books.remove(index);
            }
        }
    }

    /**
     * Adds a periodical to registry
     * If the periodical is already registered, add quantity instead
     *
     * @param periodical the Periodical to add
     */
    public void addPeriodical(Periodical periodical) {
        boolean notInRegistry = true;
        for (int i = 0; i < this.periodicals.size(); i++) {
            if (this.periodicals.get(i).getPublisher().equals(periodical.getPublisher()) && this.periodicals.get(i).getReleaseDate().equals(periodical.getReleaseDate())) {
                notInRegistry = false;
                this.periodicals.get(i).increaseQuantity(periodical.getQuantity());
            }
        }
        if (notInRegistry) {
            this.periodicals.add(periodical);
        }
    }

    /**
     * Search for book by author.
     * Searches without consideration of upper and lower case, And finds Authors names that contains the search words
     *
     * @param author author of the books
     * @return Details of found book's
     */
    public ArrayList<Book> getBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor() != null) {
                if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by title
     * Search without consideration of upper and lower case, And finds titles that contains the search words
     *
     * @param title title to search for
     * @return ArrayList containing found Books
     */
    public ArrayList<Book> getBookByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getTitle() != null) {
                if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by Seriesname
     * Search without consideration fo upper and lower case, and finds series names that contains the search words
     *
     * @param seriesName series name to search for
     * @return ArrayList containing found Books
     */
    public ArrayList<Book> getBookBySeries(String seriesName) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getSeriesName() != null) {
                if (book.getSeriesName().toLowerCase().contains(seriesName.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by genre
     * Search without consideration of upper and lower case, and finds genre names that contains the search words
     *
     * @param genre The genre to search for
     * @return ArrayList containing found Books
     */
    public ArrayList<Book> getBookByGenre(String genre) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getGenre() != null) {
                if (book.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by Publisher
     * Search without consideration of upper and lower case, and finds publisher names that contains the search words
     *
     * @param publisher the publisher to search for
     * @return ArrayList containing found Books
     */
    public ArrayList<Book> getBookByPublisher(String publisher) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getPublisher() != null) {
                if (book.getPublisher().toLowerCase().contains(publisher.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * increases quantity of books in stock
     *
     * @param books    Arraylist of books
     * @param quantity incremental value
     */
    public void increaseBookQuantity(ArrayList<Book> books, int quantity) {
        for (Book book : books) {
            book.increaseQuantity(quantity);
        }
    }

    /**
     * Increases a book's quantity. Book found by IDnumber.
     *
     * @param ID       the book's ID tag.
     * @param quantity the incremental value
     */
    public void increaseBookQuantity(long ID, int quantity) {
        for (Book book : this.books) {
            if (book.getIDnumber() == ID) {
                book.increaseQuantity(quantity);
            }
        }
    }

    /**
     * Decreases quantity of books in stock
     *
     * @param books    Arraylist of books
     * @param quantity decremental value
     */
    public void decreaseBookQuantity(ArrayList<Book> books, int quantity) {
        for (Book book : books) {
            book.decreaseQuantity(quantity);
        }
    }

    /**
     * Decreases a book's quantity. Book found by IDnumber.
     *
     * @param ID       the book's ID tag.
     * @param quantity the decremental value
     */
    public void decreaseBookQuantity(long ID, int quantity) {
        for (Book book : this.books) {
            if (book.getIDnumber() == ID) {
                book.decreaseQuantity(quantity);
            }
        }
    }

    /**
     * Prints out details of book(s)
     *
     * @param books An array list of books
     */
    public void printBooks(ArrayList<Book> books) {
        for (Book book : books) {
            book.printDetails();
        }
    }

    /**
     * Prints all books in registry
     */
    public void printBooks() {
        for (Book book : this.books) {
            book.printDetails();
        }
    }
}
