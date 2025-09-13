package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public UserRepository() {
        users.add(new User(counter.incrementAndGet(), "Alice", "alice@example.com"));
        users.add(new User(counter.incrementAndGet(), "Bob", "bob@example.com"));
    }

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(counter.incrementAndGet());
        } else {
            // In a real application, you'd update an existing user here
            // For simplicity, this example treats all saves as new or updates by ID
            users.removeIf(u -> u.getId().equals(user.getId()));
        }
        users.add(user);
        return user;
    }

    public void deleteById(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
