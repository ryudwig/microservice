package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    //Domain Entity를 JPA Entity로 변환하여 DB에 저장하는 책임을 가짐
    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
