package ru.netology.manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.PurchaseItem;
import ru.netology.repository.PosterRepository;

import static org.mockito.Mockito.doReturn;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
class PosterManagerOneFilmsTest {
    @Mock
    private PosterRepository repository;
    @InjectMocks
    private PosterManager manager;
    PurchaseItem first = new PurchaseItem(1, 1, "first", "ganer", false);

    @BeforeEach
    void setUp() {
        manager.add(first);
    }

    @Test
    public void shouldDisplayOneFilm(){
        PurchaseItem[] returned = new PurchaseItem[]{first};
        doReturn(returned).when(repository).findAll();

        PurchaseItem[] actual = manager.getShowLast();
        PurchaseItem[] expected = new PurchaseItem[]{first};

        assertArrayEquals(expected, actual);

    }
}