package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;
    private Long counter = 1L;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    // POST
    public User save(User user) {

        if (user.getRole() == null) {
            user.setRole("USER");
        }

        user.setId(counter++);
        return repo.save(user);
    }

    // GET
    public User getUser(Long id) {
        return repo.findById(id);
    }
}
