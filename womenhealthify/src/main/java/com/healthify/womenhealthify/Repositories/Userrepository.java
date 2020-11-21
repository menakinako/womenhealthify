package com.healthify.womenhealthify.Repositories;

import com.healthify.womenhealthify.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {
   
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);
}
