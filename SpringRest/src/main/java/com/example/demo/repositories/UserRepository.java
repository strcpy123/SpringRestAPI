package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository("User")
public interface UserRepository extends CrudRepository<User, String> {
    User findByEmailFieldAndPasswordField(String email, String password);
}
