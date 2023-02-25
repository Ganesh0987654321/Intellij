package com.example.demo_Ganesh.service.impl;

import com.example.demo_Ganesh.entity.User;
import com.example.demo_Ganesh.repository.UserRepo;
import com.example.demo_Ganesh.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    @Override
    public User addUser(User user) {
        User save = userRepo.save(user);
        return save;
    }
}
