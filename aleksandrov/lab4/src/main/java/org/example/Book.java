package org.example;

class Book {
    String name;
    int yearofPublication;
    int pages;
    Author author;
    public Book(String name, int yearofPublication, int
            pages, Author author) {
        this.name = name;
        this.yearofPublication = yearofPublication;
        this.pages = pages;
        this.author = author;
    }

    public String toString() {
       return "Название: " + name + " " + "Дата издания: "+ yearofPublication + " " + "Количество страниц: "+ pages + "" + author;


   }

}