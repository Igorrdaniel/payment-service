package com.igor.microservice.payment_service.application.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.igor.microservice.payment_service.domain.model.Payment;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Data
public class PaymentDTO {

  @JsonIgnore private UUID orderId;

  @NotBlank(message = "Product name cannot be blank")
  private String productName;

  @NotBlank(message = "Quantity cannot be blank")
  private int quantity;

  @NotBlank(message = "Price cannot be blank")
  private double price;

  @NotBlank(message = "Status cannot be blank")
  private String status;

  public static PaymentDTO map(Payment payment) {
    PaymentDTO paymentDTO = new PaymentDTO();

    paymentDTO.setOrderId(payment.getOrderId());
    paymentDTO.setProductName(payment.getProductName());
    paymentDTO.setQuantity(payment.getQuantity());
    paymentDTO.setPrice(payment.getPrice());
    paymentDTO.setStatus(payment.getStatus());

    return paymentDTO;
  }
}
