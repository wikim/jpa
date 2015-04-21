package net.iq.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import net.iq.domain.User;
import net.iq.util.JpaUtil;

public class UserJpaProviderImple implements UserProvider{

    @Override
    public void insertUser(User user) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(user);
        tx.commit();
        em.close();
        
    }

    @Override
    public List<User>  findAllUsers() {
        List<User> users = new ArrayList<User>();
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        users = (List<User>) em.createQuery("FROM USER U ORDER BY U.NAME ASC");
        return users;
        
        
    }
    

    @Override
    public User findUserByUserId(String userId) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        User findUser = em.find(User.class, userId);
        tx.commit();
        em.clear();
        
        return findUser;
    }


}
