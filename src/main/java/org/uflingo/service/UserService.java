package org.uflingo.service;

import org.uflingo.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser(int id);
    User updateUser(User user);
    User getUser(int id);
    List<User> getUsers(Long page);
    List<User> getUsers(String name);
}
