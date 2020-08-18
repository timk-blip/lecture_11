
package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.PurchaseItem;
import ru.netology.repository.PosterRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class PosterManagerTestNotExist {

    @Mock
    private PosterRepository repository;
    @InjectMocks
    private PosterManager manager;

    @Test
    public void shouldDisplayIfNoFilm(){
        PurchaseItem[] returned = new PurchaseItem[]{};
        doReturn(returned).when(repository).findAll();

        PurchaseItem[] actual = manager.getShowLast();
        PurchaseItem[] expected = new PurchaseItem[]{};

        assertArrayEquals(expected, actual);

    }

}