package org.uflingo.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.uflingo.model.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    private SessionFactory sessionFactory;
    private static final int resultsPerPage = 10;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    public void deleteUser(int id) {
        User user = (User)sessionFactory.getCurrentSession().get(User.class, id);
        if (user != null)
            this.sessionFactory.getCurrentSession().delete(user);
    }

    public User updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
        return user;
    }

    public User getUser(int id) {
        return (User)sessionFactory.getCurrentSession().get(User.class, id);
    }

    public List<User> getUsers(Long page) {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM org.uflingo.model.User");
        query.setFirstResult((int)(page - 1) * resultsPerPage);
        query.setMaxResults(resultsPerPage);
        List<User> users = query.list();
        return users;
    }

    public List<User> getUsers(String name) {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM User WHERE name = :name");
        query.setParameter("name", name);
        List<User> users = query.list();
        return users;
    }
}
