package com.example.demo.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;

@Repository
public class UserRepository {

    private Map<Long, User> store = new HashMap<>();

    public User save(User user) {
        store.put(user.getId(), user);
        return user;
    }

    public User findById(Long id) {
        return store.get(id);
    }
}
