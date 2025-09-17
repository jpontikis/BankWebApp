package com.example.BankWebApp.repositories;

import com.example.BankWebApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,Long> {
}
