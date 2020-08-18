package ru.netology.repository;

import ru.netology.domain.PurchaseItem;

public class PosterRepository {

    private PurchaseItem[] films = new PurchaseItem[0];

    public PurchaseItem[] findAll() {
        return films;
    }

    public void save(PurchaseItem film) {
        int length = films.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public PurchaseItem findById(int id) {
        for (PurchaseItem film : films) {
            if (film.getFilmsId() == id) {
                return film;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = films.length - 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        int index = 0;
        for (PurchaseItem film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        films = new PurchaseItem[0];
    }
}
