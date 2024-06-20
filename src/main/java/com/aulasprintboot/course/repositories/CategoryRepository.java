package com.aulasprintboot.course.repositories;

import com.aulasprintboot.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
