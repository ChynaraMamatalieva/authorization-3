package com.example.authorization3.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "auth_type")
    private OAuth2Provider authType;

    public OAuth2Provider getAuthType() {
        return authType;
    }

    public void setAuthType(OAuth2Provider authType) {
        this.authType = authType;
    }

}
