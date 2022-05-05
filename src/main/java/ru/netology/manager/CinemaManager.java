package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.CinemaData;

import static java.lang.System.arraycopy;

@Data
public class CinemaManager {

    private int quantityCinema = 5; //завел максимум
    private CinemaData[] items = new CinemaData[0];

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

    public CinemaData[] findLast(CinemaData[] items) {

        int resultLength;

        if (items.length > quantityCinema) {
            resultLength = quantityCinema;
        } else {
            resultLength = items.length;
        }

        CinemaData[] result = new CinemaData[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }

}
