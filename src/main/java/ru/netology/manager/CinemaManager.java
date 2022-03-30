package ru.netology.manager;

import ru.notology.domain.Cinema;

import static java.lang.System.arraycopy;

public class CinemaManager {

    private int quantityCinema = 5; //завел максимум
    Cinema name = new Cinema(8, "Гоблин", "сериал");

    Cinema[] names = {new Cinema(1,"Бладшот",",боевик"),
                        new Cinema(2,"Вперёд","мультфильм"),
                        new Cinema(3,"Отель Белград","комедия"),
                        new Cinema(4,"Джентльмены","боевик"),
                        new Cinema(5,"Человек-невидимка","ужасы"),
                        new Cinema(6,"Троли.Мировой тур","мультфильм"),
                        new Cinema(7,"Номер один","комедия")};         //создал массив




    public CinemaManager() {
        this.quantityCinema = 10;   //записал в память конструктор 1
    }

    public CinemaManager(int quantityCinema) {
        this.quantityCinema = quantityCinema;   //записал в память конструктор 2
    }

    //метод добавления фильма
    public void addCinema(Cinema name) {
        Cinema[] tmp = new Cinema[names.length + 1];
        //for (int i = 0; i < names.length; i++) {
        //    tmp[i] = names[i];
        //}
        //аналог
        arraycopy(names, 0, tmp, 0, tmp.length - 1);

        tmp[tmp.length-1] = name;
        names = tmp;
    }

}
