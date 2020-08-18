package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterRepositoryTest {
    PosterRepository repository = new PosterRepository();
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
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
    }

    @Test
    void findAll() {
        PurchaseItem[] actual = repository.findAll();
        PurchaseItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindIfNotExist(){
        int idToFind = 25;
        PurchaseItem actual = repository.findById(idToFind);

        assertNull(actual);
    }

    @Test
    void shouldFindById() {
        int idToFind = 7;
        PurchaseItem actual = repository.findById(idToFind);

        assertEquals(seventh, actual);
    }

    @Test
    void shouldRemoveById() {
        int idToRemove = 7;
        repository.removeById(idToRemove);

        PurchaseItem[] actual = repository.findAll();
        PurchaseItem[] expected = {first, second, third, fourth, fifth, sixth, eighth, ninth, tenth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAll() {
        repository.removeAll();

        PurchaseItem[] actual = repository.findAll();
        PurchaseItem[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdIfNotExist() {
        int idToRemove = 11;

        repository.removeById(idToRemove);

        PurchaseItem[] actual = repository.findAll();
        PurchaseItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        assertArrayEquals(expected, actual);
    }
}