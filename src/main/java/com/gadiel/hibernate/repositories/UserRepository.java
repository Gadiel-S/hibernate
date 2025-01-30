package com.gadiel.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadiel.hibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
