package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import static java.lang.System.arraycopy;

@Data
@NoArgsConstructor
public class CinemaManager {
    private int quantityCinema = 5; //завел максимум

    CinemaData[] names = {new CinemaData(1, "Бладшот", ",боевик"),
            new CinemaData(2, "Вперёд", "мультфильм"),
            new CinemaData(3, "Отель Белград", "комедия"),
            new CinemaData(4, "Джентльмены", "боевик"),
            new CinemaData(5, "Человек-невидимка", "ужасы"),
            new CinemaData(6, "Троли.Мировой тур", "мультфильм"),
            new CinemaData(7, "Номер один", "комедия")};         //создал массив

    CinemaData name = new CinemaData(8, "Гоблин", "сериал");


    public CinemaManager() {
        this.quantityCinema = 10;   //записал в память конструктор 1
    }

    public CinemaManager(int quantityCinema) {
        this.quantityCinema = quantityCinema;   //записал в память конструктор 2
    }

    //метод добавления фильма
    public CinemaData[] addCinema(CinemaData name) {
        CinemaData[] tmp = new CinemaData[names.length + 1];
        //for (int i = 0; i < names.length; i++) {
        //    tmp[i] = names[i];
        //}
        //аналог
        arraycopy(names, 0, tmp, 0, tmp.length - 1);

        tmp[tmp.length - 1] = name;
        names = tmp;
        return tmp;
    }

}
