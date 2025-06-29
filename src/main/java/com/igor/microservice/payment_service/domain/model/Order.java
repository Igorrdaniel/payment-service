package com.igor.microservice.payment_service.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

  @Column(name = "order_id")
  private UUID orderId;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "quantity")
  private int quantity;

  @Column(name = "price")
  private double price;
}
