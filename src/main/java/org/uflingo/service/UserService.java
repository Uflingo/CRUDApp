package org.uflingo.service;

import org.uflingo.model.User;

import java.util.List;

/**
 * Created by Алексей on 30.05.2017.
 */
public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser(int id);
    User updateUser(User user);
    User getUser(int id);

}
