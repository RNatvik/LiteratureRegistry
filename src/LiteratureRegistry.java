import java.util.ArrayList;

/**
 * yolo
 */

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

    public void removeBook(String authorOrTitle) {
        for (int index = 0; index < this.books.size(); index++) {
            if (this.books.get(index).getTitle().equals(authorOrTitle) || this.books.get(index).getAuthor().equals(authorOrTitle)) {
                this.books.remove(index);
            }
        }
    }

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

    public void increaseBookQuantity(ArrayList<Book> books, int quantity) {
        for (Book book : books) {
            book.increaseQuantity(quantity);
        }
    }

    public void decreaseBookQuantity(ArrayList<Book> books, int quantity) {
        for (Book book : books) {
            book.decreaseQuantity(quantity);
        }
    }

    public void printBooks(ArrayList<Book> books) {
        for (Book book : books) {
            book.printDetails();
        }
    }
    public void printAllBooks () {
        for (Book book : this.books) {
            book.printDetails();
        }
    }
}
