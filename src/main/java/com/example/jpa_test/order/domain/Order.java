package com.example.jpa_test.order.domain;

import com.example.jpa_test.store.domain.Store;
import com.example.jpa_test.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;

import java.util.List;

@Entity
@Table(name = "ORDERS", indexes = {@Index(columnList = "productName")})
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private Long id;
    private Integer price;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @ManyToOne
//    @JoinColumn(name = "")
    private Store store;
}
