package ru.netology.manager;

import ru.netology.domain.CinemaData;

import static java.lang.System.arraycopy;

public class CinemaDataRepozitory {

    CinemaData[] items = {new CinemaData(1, "Бладшот", ",боевик"),
            new CinemaData(2, "Вперёд", "мультфильм"),
            new CinemaData(3, "Отель Белград", "комедия"),
            new CinemaData(4, "Джентльмены", "боевик"),
            new CinemaData(5, "Человек-невидимка", "ужасы"),
            new CinemaData(6, "Троли.Мировой тур", "мультфильм"),
            new CinemaData(7, "Номер один", "комедия")};

    CinemaData name = new CinemaData(8, "Гоблин", "сериал");


    public void save(CinemaData name) {

        int length = items.length + 1;
        CinemaData[] tmp = new CinemaData[length];
        arraycopy(items, 0, tmp, 0, tmp.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = name;
        items = tmp;
    }

    public CinemaData[] findAll() {
        return items;
    }
}
