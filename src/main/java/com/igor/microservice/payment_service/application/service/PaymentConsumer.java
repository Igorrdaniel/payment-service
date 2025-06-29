package com.igor.microservice.payment_service.application.service;

import com.igor.microservice.payment_service.application.dto.OrderDTO;

public interface PaymentConsumer {

  void consumePayment(OrderDTO orderDTO);
}
