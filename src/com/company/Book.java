package com.company;


public class Book {

    private static int uniq_id = 1; //идентификатор для следующей книги
    private int id;
    private String author; //автор
    private String name; //название
    private int year; //год выпуска

    public Book(String author, String name, int year) {
        id = uniq_id++;
        this.author = author;
        this.name = name;
        this.year = year;
    }

    //абстрактный метод
    @Override
    public String toString() {
        String res = "№" + getId() + "; Автор = " + getAuthor() + "; Название = " + getName() + "; Год выпуска = " + getYear() + ";";
        return res;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }
}
