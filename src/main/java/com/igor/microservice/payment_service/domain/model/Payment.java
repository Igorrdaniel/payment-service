package com.igor.microservice.payment_service.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "payments")
public class Payment {

  @Id
  @Column(name = "order_id")
  private UUID orderId;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "quantity")
  private int quantity;

  @Column(name = "price")
  private double price;

  @Column(name = "status")
  private String status;

  public Payment(UUID orderId, String productName, int quantity, double price, String status) {
    this();
    this.orderId = orderId;
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
    this.status = status;
  }

  protected Payment() {
    super();
  }
}
