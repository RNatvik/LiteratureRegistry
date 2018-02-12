import java.util.ArrayList;


public class LiteratureRegistry {

    private ArrayList<Book> books;
    private ArrayList<Periodical> periodicals;

    public LiteratureRegistry() {
        this.books = new ArrayList<>();
        this.periodicals = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public ArrayList<Periodical> getPeriodicals() {
        return this.periodicals;
    }

    /**
     * If the parameter book is not in the reistry Add parameter book to regestry
     * @param book Adds a new book to the regestry
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

    /**
     * Remove's book from Index
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
     * Add's periodical to regisry if it's alredy there add quantity
     * @param periodical Periodical to add
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
     * Search fore book by author(author is string), Searches without consideration of upper and lower case, And finds Authors names that contains the search word's
     * @param author author of the books
     * @return Details of found book's
     */
    public ArrayList<Book> getBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for(Book book : books) {
            if (book.getAuthor() != null) {
                if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by Title(Title is String), Search without consideration of upper and lower case, And finds Titles that contains the search words
     * @param title Title of the books
     * @return Details of found books
     */
    public ArrayList<Book> getBookByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for(Book book : this.books) {
            if (book.getTitle() != null) {
                if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by Seriesname(seriesName is string), Search without consideration fo upper and lower case, and finds series names that contains the search words
     * @param seriesName series name to the book series
     * @return Details of found books
     */
    public ArrayList<Book> getBookBySeries(String seriesName) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for(Book book : this.books) {
            if (book.getSeriesName() != null) {
                if (book.getSeriesName().toLowerCase().contains(seriesName.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by genre(Genre is string), Search without consideration of upper and lower case, and finds genre names that contains the search words
     * @param genre The books genre
     * @return Details of found books
     */
    public ArrayList<Book> getBookByGenre(String genre) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for(Book book : this.books) {
            if (book.getGenre() != null) {
                if (book.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    /**
     * Search for books by Publisher(Publisher is string), Search without consideration of upper and lower case, and finds publisher names that contains the search words
     * @param publisher The publisher of the books
     * @return Details of found books
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
     * increases quantity of book of books in stock
     * @param books Object array book
     * @param quantity Quantity of books
     */
    public void increaseBookQuantity(ArrayList<Book> books, int quantity) {
        for (Book book : books) {
            book.increaseQuantity(quantity);
        }
    }

    /**
     * Decreases the quantity of books in stock
     * @param books An array list of books
     * @param quantity Quantity of books
     */
    public void decreaseBookQuantity(ArrayList<Book> books, int quantity) {
        for (Book book : books) {
            book.decreaseQuantity(quantity);
        }
    }

    /**
     * Prints out details of book
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
    public void printBooks () {
        for (Book book : this.books) {
            book.printDetails();
        }
    }
}
