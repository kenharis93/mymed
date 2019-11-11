package com.kenharis.mymed4.repo;

import com.kenharis.mymed4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String userName);
}
