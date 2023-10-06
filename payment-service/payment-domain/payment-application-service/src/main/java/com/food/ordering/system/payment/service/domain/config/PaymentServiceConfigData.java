package com.food.ordering.system.payment.service.domain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "payment-service")
@Data
public class PaymentServiceConfigData {
    private String paymentRequestTopicName;
    private String paymentResponseTopicName;
}
