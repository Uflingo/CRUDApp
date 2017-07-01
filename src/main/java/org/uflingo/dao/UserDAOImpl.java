package org.uflingo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.uflingo.model.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    public void deleteUser(int id) {
        User user = sessionFactory.getCurrentSession().load(User.class, id);
        if (user != null)
            this.sessionFactory.getCurrentSession().delete(user);
    }

    public User updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
        return user;
    }

    public User getUser(int id) {
        return sessionFactory.getCurrentSession().load(User.class, id);
    }
}
