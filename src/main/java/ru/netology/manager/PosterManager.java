package ru.netology.manager;

import lombok.Getter;
import ru.netology.domain.PurchaseItem;
import ru.netology.repository.PosterRepository;

public class PosterManager {
    @Getter
    private int films = 10;
    private PosterRepository repository;

    public PosterManager(PosterRepository repository) {
        this.repository = repository;
    }

    public PosterManager() {
    }
    public PosterManager(int films, PosterRepository repository) {
        this.repository = repository;
        if (films > 0)
            this.films = films;
    }
    public void add(PurchaseItem film) {
        repository.save(film);
    }

    public PurchaseItem[] getShowLast() {
        PurchaseItem[] film = repository.findAll();

        int lengthDisplayFilm = Math.min(film.length, films);
        PurchaseItem[] result = new PurchaseItem[lengthDisplayFilm];
        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = film[index];
        }
        return result;
    }
}
