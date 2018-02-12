public class Main {
    /**
     * Hei ruben livet til den rosa dragen har ikke vært som de burde i de siste.
     * Hvordan går de med deg og dine
     * @param args
     */
    public static void main(String[] args) {

        LiteratureRegistry litReg = new LiteratureRegistry();

        litReg.addBook(new Book("Peter V. Brett", "The Painted Man", "The Demon Cycle", 1,
                "Fantasy", "Del Rey Books", 2010, "", 5));

        litReg.addBook(new Book("Peter V. Brett", "The Desert Spear", "The Demon Cycle", 2,
                "Fantasy", "Del Rey Books", 2011, "", 5));

        litReg.addBook(new Book("Peter V. Brett", "The Daylight War", "The Demon Cycle", 3,
                "Fantasy", "Del Rey Books", 2012,"", 5));

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


        litReg.printBooks(litReg.getBookByTitle("The fellowship"));
        litReg.increaseBookQuantity(litReg.getBookByTitle("The fellowship"), 10);


    }
}
