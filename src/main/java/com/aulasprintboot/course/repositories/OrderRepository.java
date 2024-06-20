package com.aulasprintboot.course.repositories;

import com.aulasprintboot.course.entities.Order;
import com.aulasprintboot.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
