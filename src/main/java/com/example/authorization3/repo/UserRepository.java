package com.example.authorization3.repo;

import com.example.authorization3.model.OAuth2Provider;
import com.example.authorization3.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    @Modifying
    @Query("UPDATE User u SET u.authType = ?2 WHERE u.username = ?1")
    public void updateAuthenticationType(String username, OAuth2Provider authType);
}
