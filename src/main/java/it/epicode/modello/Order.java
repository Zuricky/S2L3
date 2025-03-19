package it.epicode.modello;
import lombok.Getter;
import java.time.LocalDate;
import java.util.List;

// id, status (String), customer (it.epicode.model.Customer), orderDate (LocalDate), deliveryDate (LocalDate), products (List<it.epicode.model.Product>)
public class Order {
    private Long id;
    private String status;
    @Getter
    private Customer customer;
    @Getter
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    @Getter
    private List<Product> products;

    public Order(Long id, String status, Customer customer, LocalDate orderDate, LocalDate deliveryDate, List<Product> products) {
        this.id = id;
        this.status = status;
        this.customer = customer;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
    }
}