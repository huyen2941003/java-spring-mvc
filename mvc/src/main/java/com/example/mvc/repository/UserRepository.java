package com.example.mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mvc.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User createUser);
}
