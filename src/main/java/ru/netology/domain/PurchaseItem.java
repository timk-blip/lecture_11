package ru.netology.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PurchaseItem {
    private int id;
    private int filmsId;
    private String nameFilms;
    private String ganerFilms;
    private boolean premierTomorrow;
}