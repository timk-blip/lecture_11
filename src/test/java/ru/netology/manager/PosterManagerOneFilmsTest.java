package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerOneFilmsTest {
    PosterManager manager = new PosterManager();
    PurchaseItem first = new PurchaseItem(1, 1, "first", "ganer", false);

    @BeforeEach
    void setUp() {
        manager.add(first);
    }

    @Test
    public void shouldAddOneFilms() {
        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{first};
        assertArrayEquals(actual, expected);
    }
}