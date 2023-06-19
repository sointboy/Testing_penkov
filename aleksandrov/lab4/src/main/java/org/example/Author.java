package org.example;

public class Author {
    String Authorname;
    int age;

    public Author(String Authorname, int age){
        this.Authorname = Authorname;
        this.age = age;
    }
    public String toString() {
        return "Имя автора: " + Authorname + " " + "Возраст: "+ age;


    }

}
