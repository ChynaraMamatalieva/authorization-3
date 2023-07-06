package com.example.authorization3.service;

import com.example.authorization3.model.OAuth2Provider;
import com.example.authorization3.repo.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repo;

    public void updateAuthenticationType(String username, String oauth2ClientName) {
        OAuth2Provider authType = OAuth2Provider.valueOf(oauth2ClientName.toUpperCase());
        repo.updateAuthenticationType(username, authType);
    }
}
