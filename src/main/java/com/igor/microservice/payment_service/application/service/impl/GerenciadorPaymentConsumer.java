package com.igor.microservice.payment_service.application.service.impl;

import com.igor.microservice.payment_service.application.dto.OrderDTO;
import com.igor.microservice.payment_service.application.service.PaymentConsumer;
import com.igor.microservice.payment_service.domain.model.Payment;
import com.igor.microservice.payment_service.domain.repository.PaymentRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class GerenciadorPaymentConsumer implements PaymentConsumer {

  private final PaymentRepository paymentRepository;

  public GerenciadorPaymentConsumer(PaymentRepository paymentRepository) {
    this.paymentRepository = paymentRepository;
  }

  @KafkaListener(topics = "order-topico", groupId = "payment-group")
  @Override
  public void consumePayment(OrderDTO orderDTO) {
    Payment payment =
        new Payment(
            orderDTO.getOrderId(),
            orderDTO.getProductName(),
            orderDTO.getQuantity(),
            orderDTO.getPrice(),
            "PAID");

    System.out.println("Consuming payment: " + orderDTO);

    paymentRepository.save(payment);
  }
}
