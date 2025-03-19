package it.epicode.esercizi;
import it.epicode.modello.Order;
import java.util.List;
import java.util.stream.Collectors;

// stream, lista di ordini con proddotti categoria "Baby"
public class Esercizio2 {
    public static List<Order> getOrdersWithBabyProducts(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby")))
                .collect(Collectors.toList());
    }
}
