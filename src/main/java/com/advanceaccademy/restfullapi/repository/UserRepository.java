package com.advanceaccademy.restfullapi.repository;

import com.advanceaccademy.restfullapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
