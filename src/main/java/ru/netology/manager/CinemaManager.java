package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.CinemaData;

import static java.lang.System.arraycopy;

@Data
public class CinemaManager {
    private CinemaDataRepozitory repo;
    private int quantityCinema = 5; //завел максимум

    public CinemaManager() {
        this.quantityCinema = 10;   //записал в память конструктор 1
    }

    public CinemaManager(int quantityCinema) {
        this.quantityCinema = quantityCinema;   //записал в память конструктор 2
    }

    public CinemaManager(CinemaDataRepozitory repository) {
        this.repo = repository;
    }
    CinemaData[] items = {new CinemaData(1, "Бладшот", ",боевик"),
            new CinemaData(2, "Вперёд", "мультфильм"),
            new CinemaData(3, "Отель Белград", "комедия"),
            new CinemaData(4, "Джентльмены", "боевик"),
            new CinemaData(5, "Человек-невидимка", "ужасы"),
            new CinemaData(6, "Троли.Мировой тур", "мультфильм"),
            new CinemaData(7, "Номер один", "комедия")};         //создал массив

    CinemaData name = new CinemaData(8, "Гоблин", "сериал");

    //метод добавления фильма
    public CinemaData[] addCinema(CinemaData name) {
        CinemaData[] tmp = new CinemaData[items.length + 1];
        arraycopy(items, 0, tmp, 0, tmp.length - 1);

        tmp[tmp.length - 1] = name;
        items = tmp;
        return tmp;
    }

    public void addFilm(CinemaData film) {

        repo.save(film);
    }
}
