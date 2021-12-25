package com.company;

import java.util.ArrayList;

//некоторый отдел с книгами
public abstract class Depart {

    ArrayList<Book> books; //книги

    //конструктор
    public Depart() {
        books = new ArrayList<>();
    }

    //добавление книги
    void add(Book b) {
        books.add(b);
    }

    //вывод всех книг отдела
    void print() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    @Override
    public abstract String toString();

    //вывод всей информации об отделе
    public void printAll() {
        System.out.println(this);
        print();
    }

    //поиск по автору книги в отделе
    public Book find(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().toLowerCase().contains(author.toLowerCase())) {
                return books.get(i);
            }
        }
        return null; //в том случае, если не нашли
    }

    //получение кол-ва книг
    public int getSize() {
        return books.size();
    }
}
