package com.estudo.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.projetoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
