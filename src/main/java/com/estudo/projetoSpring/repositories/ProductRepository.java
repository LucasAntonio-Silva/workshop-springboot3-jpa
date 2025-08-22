package com.estudo.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.projetoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
