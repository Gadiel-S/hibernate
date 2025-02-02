package com.gadiel.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadiel.hibernate.entities.OrderItem;
import com.gadiel.hibernate.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
