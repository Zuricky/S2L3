package it.epicode.esercizi;
import it.epicode.modello.Product;
import java.util.List;
import java.util.stream.Collectors;

// stream, lista di prodotti categoria "Books", prezzo > 100
public class Esercizio1 {
    public static List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
            .filter(p -> p.getCategory().equals("Books"))
            .filter(p -> p.getPrice() > 100)
            .collect(Collectors.toList());
    }
}