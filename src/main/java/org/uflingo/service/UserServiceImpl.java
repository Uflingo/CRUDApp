package org.uflingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.uflingo.dao.UserDAO;
import org.uflingo.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Transactional
    public User updateUser(User user) {
        return userDAO.updateUser(user);
    }

    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Transactional
    public List<User> getUsers(Long page) {
        return userDAO.getUsers(page);
    }

    @Transactional
    public List<User> getUsers(String name) {
        return userDAO.getUsers(name);
    }
}
