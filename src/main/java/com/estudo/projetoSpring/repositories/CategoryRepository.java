package com.estudo.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.projetoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
