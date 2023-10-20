package pro.sky.java.course1.hw12;

import pro.sky.java.course1.hw12.Author;
import pro.sky.java.course1.hw12.Book;

public class Main {
    public static void main(String[] args) {
        Author spenser = new Author("Spenser", "Johnson");
        Author strofilov = new Author("Yriy", "Strofilov");
        Author axat = new Author("Federico", "Axat");

        Book cheese = new Book(spenser, "Where id my Cheese", 1998);
        Book running = new Book(strofilov, "Not about running", 2019);
        Book amnesia = new Book(axat, "Amnesia", 2018);

        cheese.setPublicationYear(1998);
    }
}