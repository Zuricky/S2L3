package it.epicode.esercizi;
import it.epicode.modello.Order;
import it.epicode.modello.Product;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

// stream, lista prodotti ordinati da clienti livello 2 (tier) tra 01-Feb-2021 e 01-Apr-2021
public class Esercizio4 {
    public static List<Product> getProductsOrderedByCustomerTier(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getCustomer().getTier() == 2)
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) && order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
