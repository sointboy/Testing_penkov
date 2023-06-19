package org.example;

public class Main {
    public static void main(String[] args) {
        Author aut1 = new Author("Aeron Rowling", 72);
        Author aut2 = new Author("Bowlee Columb", 56);
        Book ffff = new Book("Harry Potter", 1997, 234, aut1);
        System.out.println(ffff);
        Book ffff1 = new Book("Alice in wonderland", 2004, 442, aut2);
        System.out.println(ffff1);

    }
}
