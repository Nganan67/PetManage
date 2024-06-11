package org.example.petmanage1.service;

import org.example.petmanage1.domain.User;
import org.example.petmanage1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //实现注册用户的逻辑
    public User registerUser(User user) {
        return userRepository.save(user);
    }
    //实现登录用户的逻辑
    public  User loginUser(User user) {
        return userRepository.findByUserName(user.getUserName());
    }
}
