package com.company.app.service;

import com.company.app.model.User;
import com.company.app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user, Long userId) {
        User u = userRepository.findById(userId).orElseThrow();
        u.setPassword(user.getPassword());
        u.setUsername(user.getUsername());
        u.setUsrImg(user.getUsrImg());

        return userRepository.save(getById(userId));

    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public User getById(Long userId) {
         return userRepository.findById(userId)
                 .orElseThrow(()->new RuntimeException("User was not found with id="+userId));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
