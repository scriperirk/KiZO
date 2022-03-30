package ru.netology.manager;

import ru.notology.domain.Cinema;

public class CinemaManager {

    private int quantityCinema = 5; //завел максимум
    private Cinema[] items  = new Cinema[quantityCinema]; //создал пустой массив

    public CinemaManager() {
        this.quantityCinema = 10;   //записал в память конструктор 1
    }

    public CinemaManager(int quantityCinema) {
        this.quantityCinema = quantityCinema;   //записал в память конструктор 2
    }


}
