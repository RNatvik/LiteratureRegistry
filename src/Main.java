public class Main {

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


//        litReg.printBooks();
//        litReg.printBooks(litReg.getBookBySeries("The lord of the rings"));
//        litReg.printBooks(litReg.getBookByTitle("The fellowship of the ring"));
//        litReg.printBooks(litReg.getBookByAuthor("Peter V. Brett"));
//        litReg.printBooks(litReg.getBookByGenre("Biography"));
//        litReg.printBooks(litReg.getBookByPublisher("Del Rey Books"));
//        litReg.removeBook("Alibaba");
//        litReg.getBookByAuthor("Alibaba");





    }
}
