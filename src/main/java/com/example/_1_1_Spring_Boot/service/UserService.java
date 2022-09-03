package com.example._1_1_Spring_Boot.service;

import com.example._1_1_Spring_Boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsersList();

    User findById(Long id);

    void deleteUser(Long id);

    void saveUser(User user);
}
