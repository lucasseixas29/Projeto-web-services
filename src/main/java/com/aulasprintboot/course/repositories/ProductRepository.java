package com.aulasprintboot.course.repositories;

import com.aulasprintboot.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
