package com.pedrosts.dev.course.repositories;

import com.pedrosts.dev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
