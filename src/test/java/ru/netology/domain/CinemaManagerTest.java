package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.CinemaManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CinemaManagerTest {

    @Test
    public void addFilm() {

        CinemaManager manager = new CinemaManager();
        CinemaData name = new CinemaData(9, "Гоблин", "сериал");

        CinemaData[] actual = manager.addCinema(name);
        CinemaData[] expected = {new CinemaData(1, "Бладшот", ",боевик"),
                new CinemaData(2, "Вперёд", "мультфильм"),
                new CinemaData(3, "Отель Белград", "комедия"),
                new CinemaData(4, "Джентльмены", "боевик"),
                new CinemaData(5, "Человек-невидимка", "ужасы"),
                new CinemaData(6, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(7, "Номер один", "комедия"),
                new CinemaData(9, "Гоблин", "сериал")};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm2() {

        CinemaManager manager = new CinemaManager(5);
        CinemaData name = new CinemaData(9, "Гоблин", "сериал");

        CinemaData[] actual = manager.addCinema(name);
        CinemaData[] expected = {new CinemaData(1, "Бладшот", ",боевик"),
                new CinemaData(2, "Вперёд", "мультфильм"),
                new CinemaData(3, "Отель Белград", "комедия"),
                new CinemaData(4, "Джентльмены", "боевик"),
                new CinemaData(5, "Человек-невидимка", "ужасы"),
                new CinemaData(6, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(7, "Номер один", "комедия"),
                new CinemaData(9, "Гоблин", "сериал")};
        assertArrayEquals(expected, actual);
    }
}