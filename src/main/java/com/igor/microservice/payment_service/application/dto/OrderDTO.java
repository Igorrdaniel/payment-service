package com.igor.microservice.payment_service.application.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.igor.microservice.payment_service.domain.model.Order;
import jakarta.validation.constraints.NotBlank;
import java.util.UUID;
import lombok.Data;

@Data
public class OrderDTO {

  private UUID orderId;

  @NotBlank(message = "Product name cannot be blank")
  private String productName;

  @NotBlank(message = "Quantity cannot be blank")
  private int quantity;

  @NotBlank(message = "Price cannot be blank")
  private double price;

  public static OrderDTO map(Order order) {
    OrderDTO orderDTO = new OrderDTO();

    orderDTO.setOrderId(order.getOrderId());
    orderDTO.setProductName(order.getProductName());
    orderDTO.setQuantity(order.getQuantity());
    orderDTO.setPrice(order.getPrice());

    return orderDTO;
  }
}
