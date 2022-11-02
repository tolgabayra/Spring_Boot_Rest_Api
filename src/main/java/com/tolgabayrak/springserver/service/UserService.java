package com.tolgabayrak.springserver.service;

import com.tolgabayrak.springserver.model.User;
import com.tolgabayrak.springserver.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long Id){
        userRepository.deleteById(Id);
    }
    public Optional<User> getUser(Long Id){
        return userRepository.findById(Id);
    }
}
