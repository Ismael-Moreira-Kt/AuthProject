package com.example.eventschedulr.repositories;

import com.example.eventschedulr.entities.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;



public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserDetails findByLogin(String login);
}