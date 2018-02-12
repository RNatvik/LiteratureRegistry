public class Periodical {

    private String title;
    private String publisher;
    private String genre;
    private String type;
    private String releaseDate;
    private int yearlyReleases;
    private int quantity;


    public Periodical(String title, String publisher, String genre, String type, String releaseDate, int yearlyReleases, int quantity ){
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.type = type;
        this.releaseDate = releaseDate;
        this.yearlyReleases = yearlyReleases;
        this.quantity = quantity;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public int getYearlyReleases() {
        return this.yearlyReleases;
    }

    public void setYearlyReleases(int yearlyReleases){
        this.yearlyReleases = yearlyReleases;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void increaseQuantity(int quantity){
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity){
        if (this.quantity - quantity >= 0) {
            this.quantity -= quantity;
        }
    }

    public void printDetails() {
        System.out.println("'" + getTitle()+  "'");
        System.out.println("Genre: " + getGenre());
        System.out.println("Published by '" + getPublisher() + "'. (" + getReleaseDate() + ")");
        System.out.println(getQuantity() + " copies in stock.");
        System.out.println();
    }
}
