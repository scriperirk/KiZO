package ru.netology.manager;

import ru.netology.domain.CinemaData;

public class CinemaDataRepozitory {

    private CinemaData[] items = {new CinemaData(1, "Бладшот", ",боевик"),
            new CinemaData(2, "Вперёд", "мультфильм"),
            new CinemaData(3, "Отель Белград", "комедия"),
            new CinemaData(4, "Джентльмены", "боевик"),
            new CinemaData(5, "Человек-невидимка", "ужасы"),
            new CinemaData(6, "Троли.Мировой тур", "мультфильм"),
            new CinemaData(7, "Номер один", "комедия")};

    CinemaData name = new CinemaData(8, "Гоблин", "сериал");


    public CinemaData[] findAll() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        return items;
    }
}
