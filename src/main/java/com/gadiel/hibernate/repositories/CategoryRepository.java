package com.gadiel.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadiel.hibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
