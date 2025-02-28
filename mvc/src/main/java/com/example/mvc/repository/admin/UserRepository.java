package com.example.mvc.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mvc.domain.User;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User createUser);

    List<User> findByEmail(String email);

    List<User> findByEmailAndAddress(String email, String address);

    List<User> findAll();

    Optional<User> findById(Long id);

    void deleteById(long id);
}
