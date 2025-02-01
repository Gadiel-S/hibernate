package com.gadiel.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadiel.hibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
