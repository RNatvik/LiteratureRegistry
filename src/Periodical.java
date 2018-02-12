public class Periodical {

    private String title;
    private String publisher;
    private String genre;
    private String format;
    private String releaseDate;
    private int yearlyReleases;
    private int quantity;

    /**
     * Constructor for Periodical
     * @param title The periodical's Title
     * @param publisher The Periodical's Publisher
     * @param genre The Periodical's Genre
     * @param format The Periodical's Format
     * @param releaseDate The Peiodical's Releasdate
     * @param yearlyReleases The number of releases per year
     * @param quantity Quantity in stock
     */

    public Periodical(String title, String publisher, String genre, String format, String releaseDate, int yearlyReleases, int quantity ){
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.format = format;
        this.releaseDate = releaseDate;
        this.yearlyReleases = yearlyReleases;
        this.quantity = quantity;

    }

    /**
     * Get's Periodical's Title
     * @return the tilte as String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set's the Title
     * @param title the title name
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get's the Periodical's Publisher
     * @return The Publisher as a String
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set's the Periodical's Publisher
     * @param publisher the publisher's name
     */
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    /**
     * Get's the Periodical*s  genre
     * @return The Genre as a String
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Set's the Periodical's genre
     * @param genre the genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     *Get's the Periodical's Format
     * @return The Format as String
     */
    public String getformat(){
        return this.format;
    }

    /**
     * Set's the Periodical's Format
     * @param format The format
     */
    public void setformat(String format){
        this.format = format;
    }

    /**
     * Get's Periodical's Releasedate
     * @return The ReleaseDate String
     */
    public String getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * Set's periodical's Releasedate
     * @param releaseDate The ReleasDate
     */
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    /**
     * Get's the nummber of yearly releases
     * @return The nummber of yearly releases as INT
     */
    public int getYearlyReleases() {
        return this.yearlyReleases;
    }

    /**
     * Set's the nummber of yearly releases
     * @param yearlyReleases the nummber of releases a year
     */
    public void setYearlyReleases(int yearlyReleases){
        this.yearlyReleases = yearlyReleases;
    }

    /**
     * Get's the Quantity of a spesefic periodical in stock
     * @return The quantity as INT
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Increease's quantity of periodical in stock
     * @param quantity the incremental value
     */
    public void increaseQuantity(int quantity){
        this.quantity += quantity;
    }

    /**
     * Reduces the quantity of periodical in stock
     * @param quantity the decremental value
     */
    public void decreaseQuantity(int quantity){
        if (this.quantity - quantity >= 0) {
            this.quantity -= quantity;
        }
    }

    /**
     * Prints out all the information about the periodical
     */
    public void printDetails() {
        System.out.println("'" + getTitle()+  "'");
        System.out.println("Genre: " + getGenre());
        System.out.println("Published by '" + getPublisher() + "'. (" + getReleaseDate() + ")");
        System.out.println(getQuantity() + " copies in stock.");
        System.out.println();
    }
}
