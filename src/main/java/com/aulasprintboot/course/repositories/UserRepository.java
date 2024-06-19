package com.aulasprintboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aulasprintboot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {




}
