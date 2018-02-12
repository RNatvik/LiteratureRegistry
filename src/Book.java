

public class Book {

    private String author;
    private String title;
    private boolean series;
    private String seriesName;
    private int seriesNumber;
    private String genre;
    private String publisher;
    private int releaseYear;
    private String edition;
    private int quantity;


    /**
     * Constructor for a book that is part of a series
     * @param author the book's author
     * @param title the book's title
     * @param seriesName the name of the series the book is part of
     * @param seriesNumber the book's number in the series
     * @param genre the book's genre
     * @param publisher the book's publisher
     * @param releaseYear the book's release year
     * @param quantity the quantity in stock for this book
     */
    public Book(String author, String title, String seriesName, int seriesNumber, String genre, String publisher, int releaseYear, String edition, int quantity) {
        this.author = author;
        this.title = title;
        this.series = true;
        this.seriesName = seriesName;
        this.seriesNumber = seriesNumber;
        this.genre = genre;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.edition = edition;
        this.quantity = quantity;
    }

    /**
     * Constructor for a book that is NOT part of a series
     * @param author the book's author
     * @param title the book's title
     * @param genre the book's genre
     * @param publisher the book's publisher
     * @param releaseYear the book's release year
     * @param quantity the quantity in stock for this book
     */
    public Book(String author, String title, String genre, String publisher, int releaseYear, String edition, int quantity) {
        this.author = author;
        this.title = title;
        this.series = false;
        this.seriesName = "";
        this.seriesNumber = 0;
        this.genre = genre;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.edition = edition;
        this.quantity = quantity;
    }

    /**
     * Gets the book's author
     * @return the author as String
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Sets the author's name
     * @param author the name of the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the book's title
     * @return the title as String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the book's title
     * @param title the book' title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Check if the book is part of a series
     * @return series (true or false)
     */
    public boolean isSeries() {
        return this.series;
    }

    /**
     * Gets the book's series name
     * @return the name of the series as String. (null if not part of a series)
     *
     */
    public String getSeriesName() {
        String seriesName = null;
        if(this.series) {
            seriesName = this.seriesName;
        }
        return seriesName;
    }

    /**
     * Sets the name of the series
     * @param seriesName the name of the series
     */
    private void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    /**
     * Gets the book's number as part of it's series
     * @return
     */
    public int getSeriesNumber() {
        int seriesNumber = 0;
        if(this.series) {
            seriesNumber = this.seriesNumber;
        }
        return seriesNumber;
    }

    /**
     * Sets the book's series number
     * @param seriesNumber the number in the book's series
     */
    private void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    /**
     * Sets the book as part of a series (this.series = true)
     * @param seriesName the name of the series
     * @param bookNumber the book's number in the series
     */
    public void setSeries(String seriesName, int bookNumber) {
        this.series = true;
            setSeriesName(seriesName);
            setSeriesNumber(bookNumber);
    }

    /**
     * Removes the book from it's series.
     */
    public void removeFromSeries() {
        this.series = false;
        setSeriesName("");
        setSeriesNumber(0);
    }



    /**
     * Gets the book's genre
     * @return the genre as String
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Sets the book's genre
     * @param genre the book's genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets the book's publisher
     * @return publisher as String
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Sets the book's publisher
     * @param publisher the book's publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets the book's release year
     * @return the book's release year as int
     */
    public int getReleaseYear() {
        return this.releaseYear;
    }

    /**
     * Sets the book's release year
     * @param releaseYear the book's release year
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * Gets the book's edition
     * @return the edition as String
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * Sets the book's edition
     * @param edition the edition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * Gets the book's quantity in stock
     * @return the quantity as int
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Increases the book's quantity in stock
     * @param quantity the incremental value
     */
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    /**
     * Reduces the book's quantity in stock
     * @param quantity the decremental value
     */
    public void decreaseQuantity(int quantity) {
        if (this.quantity - quantity >= 0) {
            this.quantity -= quantity;
        }
    }

    /**
     * Prints out all the information about the book to system.
     */
    public void printDetails() {
        System.out.println("'" + getTitle() + "' by '" + getAuthor() + "'.");
        if (isSeries()) {
            System.out.println("Book " + getSeriesNumber() + " of '" + getSeriesName() + "'.");
        }
        System.out.println("Genre: " + getGenre());
        System.out.println("Published by '" + getPublisher() + "'. (" + getReleaseYear() + ")");
        System.out.println(getQuantity() + " copies in stock.");
        System.out.println();
    }
}