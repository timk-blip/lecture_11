package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaManagerTestNotExist {
    private PosterManager manager = new PosterManager();

    @Test
    public void shouldDisplayIfNotExist(){
        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{};

        assertArrayEquals(expected, actual);

    }

}