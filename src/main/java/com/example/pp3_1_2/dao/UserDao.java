package com.example.pp3_1_2.dao;

import com.example.pp3_1_2.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
