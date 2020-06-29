package com.team2.laps.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.team2.laps.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);
    
    Optional<User> findByName(String name);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    
    @Query("Select u.name from User u")
    ArrayList<String> findAllStaffNames();
}