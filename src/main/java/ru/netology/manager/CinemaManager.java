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

    public CinemaData[] addFilm(CinemaData[] items, CinemaData name) {

        int length = items.length + 1;
        CinemaData[] tmp = new CinemaData[length];

        arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = name;
        items = tmp;
        return tmp;
    }

    public CinemaData[] showAll(CinemaData[] items) {
        for (int i = items.length - 1; i > items.length - (this.quantityCinema + 1) & i >= 0; i--) {
        }
        return new CinemaData[0];
    }

}
