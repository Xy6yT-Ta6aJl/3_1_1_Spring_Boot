package com.example._1_1_Spring_Boot.dao;

import com.example._1_1_Spring_Boot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    User findById(Long id);
}
