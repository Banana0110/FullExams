package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //три отдела
        Depart[] arr = new Depart[3];
        arr[0] = new ArtDepart();
        arr[1] = new LawDepart();
        arr[2] = new TechDepart(true);

        //добавляем по 3 книги в каждый отдел
        arr[0].add(new Book("Канеки Кен", "Мертвый внутри", 2022));
        arr[0].add(new Book("Джо Паркер", "Как душить своего соседа", 2022));
        arr[0].add(new Book("Юн Чжан", "Как стать успешным, если ты китаец", 2022));

        arr[1].add(new Book("Вячеслав Обруч", "Хороший юрист / Плохой юрист", 2021));
        arr[1].add(new Book("Медовый Шейкер", "Теория государства и права", 2019));
        arr[1].add(new Book("Аттокур Панорама", "Уголовное право", 2019));

        arr[2].add(new Book("Альберт Эйнштейн", "Эволюция физики", 2001));
        arr[2].add(new Book("Мотыга К.Б.", "Термодинамика и физика", 1966));
        arr[2].add(new Book("Иванов Иван", "Как стать бойцом Java", 2011));

        //выводим всю информацию о каждом отделе
        for (int i = 0; i < 3; i++) {
            arr[i].printAll();
            System.out.println();
        }

        //Поиск книги в отделе худ. Литературы
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите название автора для поиска книги в отделе худ. литературы:");
        System.out.print("Автор = ");
        String author = sc.nextLine();
        Book b = arr[0].find(author);
        if (b != null) {
            System.out.println("Удалось найти следующую книгу:");
            System.out.println(b);
        } else {
            System.out.println("Книги с указанным автором нет в данном отделе");
        }
    }

}
