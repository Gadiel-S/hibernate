package com.gadiel.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadiel.hibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
