package com.kadiraksoy.factory_strategy_design_pattern.repository;

import com.kadiraksoy.factory_strategy_design_pattern.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
