package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.manager.CinemaManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
class CinemaManagerTest {

    CinemaData name = new CinemaData(7, "Гоблин", "сериал");

    @Test
    public void addFilm() {
        CinemaManager manager = new CinemaManager();
        CinemaData[] items = {new CinemaData(0, "Бладшот", ",боевик"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(2, "Отель Белград", "комедия"),
                new CinemaData(3, "Джентльмены", "боевик"),
                new CinemaData(4, "Человек-невидимка", "ужасы"),
                new CinemaData(5, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(6, "Номер один", "комедия")};

        CinemaData[] actual = manager.addFilm(items, name);
        CinemaData[] expected = {new CinemaData(0, "Бладшот", ",боевик"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(2, "Отель Белград", "комедия"),
                new CinemaData(3, "Джентльмены", "боевик"),
                new CinemaData(4, "Человек-невидимка", "ужасы"),
                new CinemaData(5, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(6, "Номер один", "комедия"),
                new CinemaData(7, "Гоблин", "сериал")};
        assertArrayEquals(expected, actual);
    }


    @Test
    void findLastFilms() {
        CinemaManager manager1 = new CinemaManager(5);
        CinemaData[] items = {new CinemaData(0, "Бладшот", "боевик"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(2, "Отель Белград", "комедия"),
                new CinemaData(3, "Джентльмены", "боевик"),
                new CinemaData(4, "Человек-невидимка", "ужасы"),
                new CinemaData(5, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(6, "Номер один", "комедия"),
                new CinemaData(7, "Гоблин", "сериал")};


        CinemaData[] actual = manager1.findLast(items);
        CinemaData[] expected = {new CinemaData(7, "Гоблин", "сериал"),
                new CinemaData(6, "Номер один", "комедия"),
                new CinemaData(5, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(4, "Человек-невидимка", "ужасы"),
                new CinemaData(3, "Джентльмены", "боевик")};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastFilms1() {
        CinemaManager manager1 = new CinemaManager(5);
        CinemaData[] items = {new CinemaData(0, "Бладшот", "боевик"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(2, "Отель Белград", "комедия"),
                new CinemaData(3, "Джентльмены", "боевик"),
                new CinemaData(4, "Человек-невидимка", "ужасы")};

        CinemaData[] actual = manager1.findLast(items);
        CinemaData[] expected = {new CinemaData(4, "Человек-невидимка", "ужасы"),
                new CinemaData(3, "Джентльмены", "боевик"),
                new CinemaData(2, "Отель Белград", "комедия"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(0, "Бладшот", "боевик")};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastFilms2() {
        CinemaManager manager1 = new CinemaManager(5);
        CinemaData[] items = {new CinemaData(0, "Бладшот", "боевик"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(2, "Отель Белград", "комедия")};

        CinemaData[] actual = manager1.findLast(items);
        CinemaData[] expected = {new CinemaData(2, "Отель Белград", "комедия"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(0, "Бладшот", "боевик")};

        assertArrayEquals(expected, actual);
    }
}