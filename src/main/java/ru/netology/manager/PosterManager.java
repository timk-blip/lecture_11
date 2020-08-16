package ru.netology.manager;

import lombok.Getter;
import ru.netology.domain.PurchaseItem;
public class PosterManager {
    @Getter
    private int films = 10;
    private PurchaseItem[] items = new PurchaseItem[0];

    public PosterManager(){

    }
    public PosterManager(int films){
        if (films > 0) {
            this.films = films;
        }
    }

    public void add(PurchaseItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll() {
        int lengthDisplayFilm = Math.min(items.length, films);
        PurchaseItem[] result = new PurchaseItem[lengthDisplayFilm];
        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
