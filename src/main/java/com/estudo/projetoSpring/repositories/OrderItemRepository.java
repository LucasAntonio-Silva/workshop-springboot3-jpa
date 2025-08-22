package com.estudo.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.projetoSpring.entities.OrderItem;
import com.estudo.projetoSpring.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
