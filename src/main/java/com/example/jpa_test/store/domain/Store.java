package com.example.jpa_test.store.domain;

import com.example.jpa_test.order.domain.Order;
import com.example.jpa_test.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "STORES")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 자채를 protected로 하는 거
public class Store {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STORE_ID")
    private Long id;

    private String name;

    private String address;

    @ManyToOne
    @JoinColumn(name = "USER_ID") //하지 않으면 user_user_id 이렇게 나옴
    private User user;

    @OneToMany(mappedBy = "store")
    private List<Order> orders;
}
