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

        CinemaData[] actual = manager.addFilm(name);
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
    void showAddedFilms() {
        CinemaManager manager1 = new CinemaManager(5);

        manager1.addFilm(name);
        CinemaData[] actual = manager1.showAll();
        CinemaData[] expected = {new CinemaData(5, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(6, "Номер один", "комедия"),
                new CinemaData(7, "Гоблин", "сериал")};
    }
}