package com.chain.springtx.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter // 예제라서 넣음
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username; // 예제라서 Enum이 아니라 String으로 받음
    private String payStatus;
}
