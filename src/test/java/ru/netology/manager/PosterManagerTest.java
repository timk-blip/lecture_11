package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    PosterManager manager = new PosterManager();
    int lastFilms = 3;
    PurchaseItem first = new PurchaseItem(1, 1, "first", "ganer", false);
    PurchaseItem second = new PurchaseItem(2, 2, "second", "ganer", true);
    PurchaseItem third = new PurchaseItem(3, 3, "third", "ganer", false);
    PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", "ganer", false);
    PurchaseItem fifth = new PurchaseItem(5, 5, "fifth", "ganer", true);
    PurchaseItem sixth = new PurchaseItem(6, 6, "sixth", "ganer", true);
    PurchaseItem seventh = new PurchaseItem(7, 7, "seventh", "ganer", false);
    PurchaseItem eighth = new PurchaseItem(8, 8, "eighth", "ganer", true);
    PurchaseItem ninth = new PurchaseItem(9, 9, "ninth", "ganer", false);
    PurchaseItem tenth = new PurchaseItem(10, 10, "tenth", "ganer", true);

    @BeforeEach
    void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    public void shouldAddAllFilms() {
        manager = new PosterManager();
        setUp();
        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldAddFilms() {
        manager = new PosterManager(8);
        setUp();
        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual, expected);
    }

}