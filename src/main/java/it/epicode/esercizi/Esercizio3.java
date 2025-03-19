package it.epicode.esercizi;
import it.epicode.modello.Product;
import java.util.List;
import java.util.stream.Collectors;

// stream, lista di prodotti categoria "Boys", 10% di sconto
public class Esercizio3 {
    public static List<Product> getDiscountedBoys(List<Product> products) {
        return products.stream()
                .filter(p -> p.getCategory().equals("Boys"))
                .map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice() * 0.9))
                .collect(Collectors.toList());
    }
}