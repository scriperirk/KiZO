package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ru.netology.manager.CinemaDataRepozitory;
import ru.netology.manager.CinemaManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class CinemaManagerTest {

   CinemaData name = new CinemaData(8, "Гоблин", "сериал");

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
                new CinemaData(8, "Гоблин", "сериал")};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm2() {

        CinemaManager manager1 = new CinemaManager(5);

        CinemaData[] actual = manager1.addFilm(name);
        CinemaData[] expected = {new CinemaData(0, "Бладшот", ",боевик"),
                new CinemaData(1, "Вперёд", "мультфильм"),
                new CinemaData(2, "Отель Белград", "комедия"),
                new CinemaData(3, "Джентльмены", "боевик"),
                new CinemaData(4, "Гоблин", "сериал")};
        assertArrayEquals(expected, actual);
    }

    @Mock
    private CinemaDataRepozitory repository;
    @InjectMocks
    private CinemaManager manager;

    CinemaData firstForTest     = new CinemaData(9, "Троли.Мировой тур", "мультфильм");
    CinemaData secondForTest    = new CinemaData(10, "Троли.Мировой тур 2", "мультфильм");
    CinemaData thirdForTest     = new CinemaData(11, "Троли.Мировой тур 3", "мультфильм");

    @Test
    void addFilm3() {
        CinemaData[] returned = new CinemaData[]{firstForTest, secondForTest};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(thirdForTest);
        manager.addFilm(thirdForTest);
        CinemaData[] expected = new CinemaData[]{firstForTest, secondForTest};
        CinemaData[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }
}