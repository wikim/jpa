package net.iq.service;

import java.util.ArrayList;
import java.util.List;

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
        
        return users;
        
        
    }


}
