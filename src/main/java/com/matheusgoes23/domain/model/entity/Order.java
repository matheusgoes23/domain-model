package com.matheusgoes23.domain.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private Instant moment;

    @NotBlank
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> Items = new ArrayList<>();

    public Order(Long id, Instant moment, OrderStatus status, Client client) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Double getTotal() {
        Double total = 0.0;
        for (OrderItem item : Items) {
            total += item.getSubTotal();
        }
        return total;
    }
}
