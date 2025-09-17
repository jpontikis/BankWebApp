package com.example.BankWebApp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(
            name = "uuid2",
            strategy = "org.hibernate.id,UUIDGenerator"
    )
    private UUID id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Transient
    @Column(nullable = false)
    private String emailVerify;

    @Column(name  = "password", nullable = false)
    private String password;

    @Transient
    @Column(nullable = false)
    private String passwordVerify;

    @Column(name = "dailyLimit", nullable = false)
    private Integer dailyLimit;
}
