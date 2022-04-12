package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.CinemaData;

import static java.lang.System.arraycopy;

@Data
public class CinemaManager {

    private int quantityCinema = 5; //завел максимум

    public CinemaManager() {
        this.quantityCinema = 10;   //записал в память конструктор 1
    }

    public CinemaManager(int quantityCinema) {
        this.quantityCinema = quantityCinema;   //записал в память конструктор 2
    }

    CinemaData[] items = {new CinemaData(0, "Бладшот", ",боевик"),
            new CinemaData(1, "Вперёд", "мультфильм"),
            new CinemaData(2, "Отель Белград", "комедия"),
            new CinemaData(3, "Джентльмены", "боевик"),
            new CinemaData(4, "Человек-невидимка", "ужасы"),
            new CinemaData(5, "Троли.Мировой тур", "мультфильм"),
            new CinemaData(6, "Номер один", "комедия")};         //создал массив

    CinemaData name = new CinemaData(7, "Гоблин", "сериал");

    public CinemaData[] addFilm(CinemaData name) {

        int length = items.length + 1;
        CinemaData[] tmp = new CinemaData[length];

        arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = name;
        items = tmp;
        return tmp;
    }

    public CinemaData[] showAll() {
        for (int i = items.length - 1; i > items.length - (this.quantityCinema + 1) & i >= 0; i--) {

        }
        return new CinemaData[0];
    }

}
