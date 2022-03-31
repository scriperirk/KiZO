package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaManagerTest {

    CinemaManager manager = new CinemaManager();
    CinemaData name = new CinemaData(9, "For all Mankind", "serial");

    @Test
    public void addFilm() {
        CinemaData[] actual = manager.addCinema(name);
        CinemaData[] expected = {new CinemaData(1, "Бладшот", ",боевик"),
                new CinemaData(2, "Вперёд", "мультфильм"),
                new CinemaData(3, "Отель Белград", "комедия"),
                new CinemaData(4, "Джентльмены", "боевик"),
                new CinemaData(5, "Человек-невидимка", "ужасы"),
                new CinemaData(6, "Троли.Мировой тур", "мультфильм"),
                new CinemaData(7, "Номер один", "комедия")};
        assertArrayEquals(expected, actual);
    }

    //@Test
    //public void testNextOne2() {
    //    CinemaManager movies1 = new CinemaManager(5);
    //    movies1.addCinema(CinemaData names);

    //    int expected = 1;
    //    int actual = movies1.getRadioStationNext();

    //    assertEquals(expected, actual);
    //}
}