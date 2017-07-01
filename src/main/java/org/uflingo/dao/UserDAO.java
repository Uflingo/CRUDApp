package org.uflingo.dao;


import org.uflingo.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser(int id);
    User updateUser(User user);
    User getUser(int id);
}
