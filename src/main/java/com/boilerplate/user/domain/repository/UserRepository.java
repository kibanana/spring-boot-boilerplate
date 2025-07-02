package com.boilerplate.user.domain.repository;

import com.boilerplate.user.domain.User;
import com.boilerplate.user.domain.UserStatus;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    
    List<User> findByStatus(UserStatus status);
    
    boolean existsByEmail(String email);
}